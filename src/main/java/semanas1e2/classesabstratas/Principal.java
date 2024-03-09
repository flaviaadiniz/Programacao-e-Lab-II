package src.main.java.semanas1e2.classesabstratas;

public class Principal {

    public static void main(String[] args) {

        Figura retangulo = new Retangulo("azul", 10, 5);
        Figura circulo = new Circulo("rosa", 7);
        Figura triangulo = new Triangulo("branco", 10, 8, 4, 4);

        calculaImprimeFigura(retangulo);
        calculaImprimeFigura(circulo);
        calculaImprimeFigura(triangulo);

    }

    public static void calculaImprimeFigura(Figura figura) {

        switch (figura.getClass().getSimpleName()) {
            case "Retangulo" -> System.out.println("Retângulo " + figura.getCor() +
                    " - Área: " + figura.calculaArea() +
                    " - Perímetro: " + figura.calculaPerimetro());
            case "Circulo" -> System.out.println("Círculo " + figura.getCor() +
                    " - Área: " + figura.calculaArea() +
                    " - Perímetro: " + figura.calculaPerimetro());
            case "Triangulo" -> System.out.println("Triângulo " + figura.getCor() +
                    " - Área: " + figura.calculaArea() +
                    " - Perímetro: " + figura.calculaPerimetro());
        }

    }

}
