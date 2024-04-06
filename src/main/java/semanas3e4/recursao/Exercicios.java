package src.main.java.semanas3e4.recursao;

public class Exercicios {

    public static void main(String[] args) {

        System.out.println(metodo(5,3));
        System.out.println(metodo(15,3));
        System.out.println(metodo(28, -45));

        System.out.println("A soma dos inteiros de 1 a 5 é igual a: " + metodo2(5));
        System.out.println("A soma dos inteiros de 1 a 10 é igual a: " + metodo2(10));

    }


    /*
    Seja a definição recursiva abaixo:
    metodo(a, b) = a, se b <= 1
    metodo(a, b) = metodo(b, a/b), se b > 1

    Qual o resultado do método acima para as seguintes chamadas:
    metodo(5, 3)
    metodo(15, 3)
    metodo(28, -45)
     */
    public static Double metodo(double a, double b) {
        if (b <= 1) {
            return a;
        } else {
            return metodo(b, (a/b));
        }
    }


    //Crie um método recursivo para calcular a soma dos inteiros de 1 a n, sendo n >= 1.
    public static int metodo2(int n) {
        if (n < 1) {
            return n;
        } else {
            return n + metodo2(n-1);
        }
    }

}
