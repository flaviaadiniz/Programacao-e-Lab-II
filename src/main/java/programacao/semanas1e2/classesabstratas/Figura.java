package programacao.semanas1e2.classesabstratas;

/*
De acordo com esta classe, criar as seguintes classes:
a) Retangulo, que possui 2 atributos: base e altura
b) Circulo, que possui um raio
c) Triangulo, que possui uma base, uma altura e dois lados
d) Principal, que possui o método main.
- Crie uma figura de cada tipo e imprima cor, área e o perímetro de cada uma delas
 */


public abstract class Figura {

    public String cor;


    public Figura(String cor) {
        this.cor = cor;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public abstract double calculaArea();

    public abstract double calculaPerimetro();

}
