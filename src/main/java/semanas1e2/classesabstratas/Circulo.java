package src.main.java.semanas1e2.classesabstratas;

public class Circulo extends Figura {

    private double raio;


    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double calculaArea() {
        return Math.round(Math.PI * Math.pow(raio, 2));
    }

    @Override
    public double calculaPerimetro() {
        return Math.round(2 * Math.PI * raio);
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                '}';
    }

}
