package src.main.java.semanas1e2.classesabstratas;

public class Retangulo extends Figura {

    private double base;
    private double altura;


    public Retangulo(String cor, int base, int altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public double calculaPerimetro() {
        return (base * 2) + (altura * 2);
    }


    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", cor='" + cor + '\'' +
                '}';
    }

}
