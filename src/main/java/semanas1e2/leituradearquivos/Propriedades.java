package src.main.java.semanas1e2.leituradearquivos;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Propriedades {

    public static void main(String[] args) {

        File file = new File("src/main/resources/teste.txt");

        System.out.println("Nome do arquivo: " + file.getName());
        System.out.println("Caminho: " + file.getPath());
        System.out.println("Caminho absoluto: " + file.getAbsolutePath());
        System.out.println("Diretório pai: " + file.getParent());
        System.out.println(file.exists() ? "Arquivo existe" : "Arquivo não existe");
        System.out.println(file.canWrite() ? "Pode ser gravado" : "Não pode ser gravado");
        System.out.println(file.canRead() ? "Pode ser lido" : "Não pode ser lido");
        System.out.println(file.isDirectory() ? "É diretório" : "Não é diretório");

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date(file.lastModified());

        System.out.println("Última modificação do arquivo: " + dateFormat.format(data));
        System.out.println("Tamanho do arquivo: " + file.length() + " bytes");


    }

}
