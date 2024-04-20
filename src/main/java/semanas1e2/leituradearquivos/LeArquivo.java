package src.main.java.semanas1e2.leituradearquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo {

    public static void main(String[] args) throws FileNotFoundException {

        String labirintoString = "src/main/resources/labirinto.txt";

        try {
            FileReader fileReader = new FileReader(labirintoString);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo " + labirintoString + " não existe!");
        } catch (IOException e) {
            System.out.println("Erro na leitura de " + labirintoString + "!");
        }

    }

}
