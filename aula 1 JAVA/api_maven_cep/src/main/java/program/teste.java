package program;


import java.io.IOException;


import model.Endereco;
import service.ViaCepService;


public class teste {


    public static void main(String[] args) {


        ViaCepService viacepservice = new ViaCepService();


        try {
            Endereco endereco = viacepservice.getEndereco("11085680");
           
            String ddd = endereco.getDdd();
            String uf = endereco.getUf();
           
            System.out.println(endereco + "\n");
            System.out.println(ddd + "\n");
            System.out.println(uf  + "\n");
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
    }
}
