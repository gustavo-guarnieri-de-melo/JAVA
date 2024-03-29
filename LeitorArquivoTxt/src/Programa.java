import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Programa {


    public static void main(String[] args) {


        String path = "C:\\temp\\arquivo01.txt";
   
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
        	// Obtem a primeira linha do arquivo
            String line = br.readLine();


            // Percorre o arquivo
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
        }
    }
}
