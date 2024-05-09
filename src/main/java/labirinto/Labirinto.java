package src.main.java.labirinto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {


    public static void criaLabirinto() {

        String labirintoString = "src/main/resources/labirinto.txt";
        try {
            FileReader fileReader = new FileReader(labirintoString);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int linhas = 0;
            int colunas = 0;

            String line = bufferedReader.readLine();
            colunas = line.length();
            while (line != null) {
                linhas++;
                line = bufferedReader.readLine();
            }

            bufferedReader.close();

            char[][] labirinto = new char[linhas][colunas];

            FileReader fileReader2 = new FileReader(labirintoString);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

            String linhaLabirinto = bufferedReader2.readLine();

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    char character = linhaLabirinto.charAt(j);
                    labirinto[i][j] = character;
                }
                linhaLabirinto = bufferedReader2.readLine();
            }

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(labirinto[i][j]);
                }
                System.out.println();
            }

            bufferedReader2.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo " + labirintoString + " não existe!");
        } catch (IOException e) {
            System.out.println("Erro na leitura de " + labirintoString + "!");
        }

    }

}
