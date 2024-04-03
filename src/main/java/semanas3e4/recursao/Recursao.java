package src.main.java.semanas3e4.recursao;

public class Recursao {

    public static void main(String[] args) {

        System.out.println("O fibonacci na posição 1 é: " + fibonacci(1));
        System.out.println("O fibonacci na posição 4 é: " + fibonacci(4));
        System.out.println("O fibonacci na posição 8 é: " + fibonacci(8));
        System.out.println("O fibonacci na posição 15 é: " + fibonacci(15));

        System.out.println();

        System.out.println("O fatorial de 3 é: " + fatorialRecursivoPublico(3));
        System.out.println("O fatorial de 5 é: " + fatorialRecursivoPublico(5));
        System.out.println("O fatorial de 10 é: " + fatorialRecursivoPublico(-10));

    }


    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }


    public static int fatorialRecursivoPublico(int n) throws IllegalArgumentException{
        if (n <= 0) {
            throw new IllegalArgumentException("Não é possível realizar fatorial de número negativo!");
        }
        return fatorialRecursivoPrivado(n);
    }

    private static int fatorialRecursivoPrivado(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorialRecursivoPrivado(n - 1);
        }
    }

}


