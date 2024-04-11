package src.main.java.semanas3e4.recursao;

public class Exercicios {

    public static void main(String[] args) {

        System.out.println(exercicio1(5,3));
        System.out.println(exercicio1(15,3));
        System.out.println(exercicio1(28, -45));

        System.out.println("A soma dos inteiros de 1 a 5 é igual a: " + exercicio2(5));
        System.out.println("A soma dos inteiros de 1 a 10 é igual a: " + exercicio2(10));

        System.out.println(exercicio3(3, 2));

        int[] array = {1, 2, 3, 4, 5, 6, 7, 50};
        System.out.println(exercicio4(array, array.length));

        System.out.println(exercicio5(2));
        System.out.println(exercicio5(4));
        System.out.println(exercicio5(9));

    }


    /*
    Exercício 1:
    Seja a definição recursiva abaixo:
    metodo(a, b) = a, se b <= 1
    metodo(a, b) = metodo(b, a/b), se b > 1

    Qual o resultado do método acima para as seguintes chamadas:
    metodo(5, 3)
    metodo(15, 3)
    metodo(28, -45)
     */
    public static Double exercicio1(double a, double b) {
        if (b <= 1) {
            return a;
        } else {
            return exercicio1(b, (a/b));
        }
    }


    //Exercício 2: Crie um método recursivo para calcular a soma dos inteiros de 1 a n, sendo n >= 1.
    public static int exercicio2(int n) {
        if (n < 1) {
            return n;
        } else {
            return n + exercicio2(n-1);
        }
    }


    /*
    Exercício 3:
    A Sequência de Ackerman é dada por:
    A(m, n) = n + 1, se m = 0
    A(m, n) = A(m − 1, 1), se m != 0 e n = 0
    A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0

    Sabendo disto, implemente o método A descrito acima.
     */
    public static int exercicio3(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return exercicio3(m-1, 1);
        } else {
            return exercicio3(m-1, exercicio3(m, n-1));
        }
    }


    //Exercício 4: Escreva um método recursivo que retorne a soma dos elementos de um array v contendo t elementos.
    public static int exercicio4(int[] v, int t) {
        if (t == 0) {
            return 0;
        } else {
            return v[v.length - t] + exercicio4(v, t - 1);
        }
    }


    //Exercício 5: Seja o método abaixo, qual o resultado para as chamadas: f(2), f(4), f(9)?
    public static int exercicio5(int x){
        int res;

        if(x < 4) {
            res = 3 * x;
        } else {
            res = 2 * exercicio5(x - 4) + 5;
        }
        return res;
    }

}
