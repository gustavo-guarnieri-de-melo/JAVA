package Exercicio;

import java.util.HashMap;

public class Programa {

	public static void main(String[] args) {
		HashMap<Integer, Aluno> alunosAprovados = new HashMap<Integer, Aluno>(); 
		
		String alunosVestibular = "Jose dos Santos,7,Sao Paulo;Sandra Silva,6.5,Sao Jose do Rio Preto;Augusto Soares,8,Sao Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,Sao Paulo;Natan Cruz,10,Sao Paulo";
        String[] listaAlunos = alunosVestibular.split(";");
        int id = 0;
        
        for (String aluno: listaAlunos) {
        	String[] dadosAluno = aluno.split(",");
    		
        	if (Double.parseDouble(dadosAluno[1]) < 7)
        		continue;
        	
        	Aluno a = new Aluno();
        	id++;
    		a.setNome(dadosAluno[0]);
    		a.setNota(Double.parseDouble(dadosAluno[1]));
    		a.setCidade(dadosAluno[2]);
    		
    		alunosAprovados.put(id, a);
        }
        
        alunosAprovados.forEach((key, value) ->{
        	System.out.println("    Id: " + key);
        	System.out.println("  Nome: " + value.getNome());
        	System.out.println("  Nota: " + value.getNota());
        	System.out.println("Cidade: " + value.getCidade());
        });
		
	}
}