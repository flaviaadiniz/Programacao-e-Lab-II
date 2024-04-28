package src.main.java.semanas5e6;

public class Aluno {

    private String nome;
    private double mediaFinal;

    public Aluno(String nome, double mediaFinal) {
        this.nome = nome;
        this.mediaFinal = mediaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
}
