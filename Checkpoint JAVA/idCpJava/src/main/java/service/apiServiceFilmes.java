package service;

import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import org.json.*;
import model.comentarios;
import model.filmes;

public class apiServiceFilmes {
	Scanner read = new Scanner(System.in);
	Integer idComent = 0;
	
	public HashMap<Integer, filmes> getFilmes() throws JSONException, ParseException, IOException {
		
		HashMap<Integer, filmes> movie = new HashMap<Integer, filmes>();

		HttpGet request = new HttpGet("https://sujeitoprogramador.com/r-api/?api=filmes");

		try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

				CloseableHttpResponse response = httpClient.execute(request)) {

			HttpEntity entity = response.getEntity();

			if (entity != null) {

				String resultado = EntityUtils.toString(entity);

				JSONArray payload = new JSONArray(resultado);

				for (int i = 0; i < payload.length(); ++i) {

					filmes filmes = new filmes();

					JSONObject dataNome = payload.getJSONObject(i);
					filmes.setId(dataNome.getInt("id"));
					filmes.setNome(dataNome.getString("nome"));
					filmes.setSinopse(dataNome.getString("sinopse"));

					movie.put(filmes.getId(), filmes);
				}
			}
		}

		return movie;

	}
	
	public String printFilmes(HashMap<Integer, filmes> filme) {
		
		String listaFilmes = "<<----FILMES DISPONIVEIS---->>";
		
		for (Integer id: filme.keySet()) {
			listaFilmes += ("\nID: "+ id + " - " + filme.get(id).getNome());
		}
		
		return(listaFilmes);
	}
	
	public String getOpcao(HashMap<Integer, filmes> filme){	
		
		System.out.print("\n\nEscolha uma opção: "
					   + "\n1- Ver detalhes"
					   + "\n2- Fazer um comentário"
					   + "\n3- Excluir um comentário"
					   + "\nDigite a opção desejada: ");
		
		int id, opcao = read.nextInt();
		
		if (opcao == 1) {
			
			String sinopseFilme;
			
			System.out.print("\nDigite o ID: ");
			id = Integer.valueOf(read.nextInt());
			
			sinopseFilme = "\nSinopse: " + filme.get(id).getSinopse();
			
			if (filme.get(id).getComentario() != null) {
				sinopseFilme = "\n<<----COMENTÁRIOS---->>";
				
				for (Integer idComentario: filme.get(id).getComentario().keySet()) {
					sinopseFilme += "\nID Comentário: " + filme.get(id).getComentario().get(idComentario).getId() + 
									 " - Nome: " + filme.get(id).getComentario().get(idComentario).getNome() + 
									 " - Comentário: " + filme.get(id).getComentario().get(idComentario).getComentario();
				}
			}
			
			else
				sinopseFilme += "\nFilme sem comentários.";
				
			return sinopseFilme;
		}
		
		else if (opcao == 2) {
			
			HashMap<Integer, comentarios> listComentarios = new HashMap<Integer, comentarios>();
			
			comentarios comentarios = new comentarios();
			
			System.out.print("Digite o ID : ");
			id = Integer.valueOf(read.nextInt());
			
			System.out.print("Qual é o seu nome: ");
			comentarios.setNome(read.next());
			
			System.out.print("Digite o comentário: ");
			comentarios.setComentario(read.next());
			
			comentarios.setId(idComent + Integer.valueOf(1));
			listComentarios.put(comentarios.getId(), comentarios);
			
			filme.get(id).setComentario(listComentarios);
			
			return "Comentado com sucesso!";
		}
		
		else if (opcao == 3) {
			
			String detalhesFilme = null;
			
			System.out.print("Digite o ID : ");
			id = Integer.valueOf(read.nextInt());
			
			if (filme.get(id).getComentario() != null) {
				
				detalhesFilme = "\n<<----COMENTÁRIOS---->>";
				
				for (Integer idComentario: filme.get(id).getComentario().keySet()) {
					detalhesFilme += "\nID Comentário: " + filme.get(id).getComentario().get(idComentario).getId() + 
									 " - Nome: " + filme.get(id).getComentario().get(idComentario).getNome() + 
									 " - Comentário: " + filme.get(id).getComentario().get(idComentario).getComentario();
				}
				
				System.out.print(detalhesFilme);
				System.out.print("\nID do Comentário que deseja excluir: ");
				
				Integer idCom = Integer.valueOf(read.nextInt());
				
				filme.get(id).getComentario().remove(idCom);
				
				return "Comentário excluido com sucesso!";
			}
			
			else {
				detalhesFilme += "\nNão possui comentários.";
				return detalhesFilme;
			}
		}

		else 
			return "";	
		
	}
	
}