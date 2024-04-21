package src.main.java.semanas1e2.leituradearquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreveArquivo {

    public static void main(String[] args) {

        try {
            File file = new File("src/main/resources/hino.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Até a pé nós iremos...");
            printWriter.print("Para o que der e vier... ");
            printWriter.println("Mas o certo é que nós estaremos...");
            printWriter.println("Com o Grêmio, onde o Grêmio estiver!");

            printWriter.close();

        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo.");
        }

    }

}
