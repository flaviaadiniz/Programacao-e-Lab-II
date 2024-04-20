package src.main.java.semanas1e2.leituradearquivos;

import java.io.File;

public class ListaDiretorios {

    public static void main(String[] args) {

        String nomeDir = "src/main/resources/";
        File file = new File(nomeDir);

        if (file.isDirectory()) {
            System.out.println("Diretório " + nomeDir);
            String[] filesList = file.list();

            for (int i = 0; i < filesList.length; i++) {
                File file2 = new File(filesList[0]);

                if (file2.isDirectory()) {
                    System.out.println(" <dir> ");
                } else {
                    System.out.println(file2.getName());
                    System.out.println(" <file> ");
                }
            }

        } else {
            System.out.println(nomeDir + " não é um diretório");
        }

    }

}
