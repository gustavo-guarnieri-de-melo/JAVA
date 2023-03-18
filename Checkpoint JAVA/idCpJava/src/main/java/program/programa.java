package program;

import java.io.IOException;
import java.util.HashMap;
import org.apache.http.ParseException;
import org.json.JSONException;
import model.filmes;
import service.apiServiceFilmes;

public class programa {

	public static void main(String[] args) throws ParseException, JSONException, IOException {
		apiServiceFilmes apiService = new apiServiceFilmes();
		HashMap<Integer, filmes> filme = apiService.getFilmes();
		
		System.out.print(apiService.printFilmes(filme));
		
		while (true) {
			System.out.print(apiService.getOpcao(filme));
		}
			
	}
	
}
