package src.main.java.semanas1e2.leituradearquivos;

import java.io.*;

public class LerConsole {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Qual o seu time? \nResposta: ");

        String time;

        try {
            time = bufferedReader.readLine();
        } catch (IOException exception) {
            time = "<" + exception + ">";
        }

        if (time.contains("inter")) {
            System.out.println("Time inválido!");
        } else {
            System.out.println("Seu time é " + time);
        }

        bufferedReader.close();

    }

}
