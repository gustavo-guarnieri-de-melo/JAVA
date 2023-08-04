
public class TestaCondições {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voce é maior de 18 anos");
			System.out.println("Seja bem vindo");
		}
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("voce nao tem 18 anos mas pode entrar, "
						+ "pois esta acompanhado");
			}else {
				System.out.println("infelizmente vc nao pode entrar");
			}
			
		}

	}

}
