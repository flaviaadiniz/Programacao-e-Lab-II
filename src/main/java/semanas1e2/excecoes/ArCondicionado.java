package src.main.java.semanas1e2.excecoes;

public class ArCondicionado {

    private double temperatura;

    public ArCondicionado() {
        this.temperatura = 20;
    }


    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }


    public void aumentaTemperatura(double tempMais) {
        try {
            this.temperatura += tempMais;
            if (temperatura < 16 || temperatura > 32) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            this.temperatura -= tempMais;
            System.out.println("Temperatura inválida! A temperatura foi mantida em " + this.getTemperatura());
        }
    }

    public void diminuiTemperatura(double tempMenos) {
        try {
            this.temperatura -= tempMenos;
            if (temperatura < 16 || temperatura > 32) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            this.temperatura += tempMenos;
            System.out.println("Temperatura inválida! A temperatura foi mantida em " + this.getTemperatura());
        }
    }


    public void aumentaTemperatura2(double tempMais) {
        this.temperatura += tempMais;
        if(temperatura < 16 || temperatura > 32){
            this.temperatura -= tempMais;
            throw new IllegalArgumentException("Temperatura inválida!");
        }
    }

    public void diminuiTemperatura2(double tempMenos) {
        this.temperatura -= tempMenos;
        if(temperatura < 16 || temperatura > 32){
            this.temperatura += tempMenos;
            throw new IllegalArgumentException("Temperatura inválida!");
        }
    }

}
