package src.main.java.semanas3e4.recursao;

public class Exercicios {

    public static void main(String[] args) {

        System.out.println(metodo(5,3));
        System.out.println(metodo(15,3));
        System.out.println(metodo(28, -45));

        System.out.println("A soma dos inteiros de 1 a 5 é igual a: " + metodo2(5));
        System.out.println("A soma dos inteiros de 1 a 10 é igual a: " + metodo2(10));

        System.out.println(metodo3(3, 2));

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

    /*
    A Sequência de Ackerman é dada por:
    A(m, n) = n + 1, se m = 0
    A(m, n) = A(m − 1, 1), se m != 0 e n = 0
    A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0

    Sabendo disto, implemente o método A descrito acima.
     */
    public static int metodo3(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return metodo3(m-1, 1);
        } else {
            return metodo3(m-1, metodo3(m, n-1));
        }
    }

}
