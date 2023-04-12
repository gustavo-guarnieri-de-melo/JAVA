
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Programa2 {


    public static void main(String[] args) {


        String[] lines = new String[] {"Turma", "Java", "Top"};
       
        String path = "C:\\temp\\arquivo02.txt";
   
        // Acrescenta mais linhas no arquivo
        //try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
       
        // Cria o recria o arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for(String line: lines) {
                // escreve a linha no arquivo
                bw.write(line);
                // pula uma linha no arquivo
                bw.newLine();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
