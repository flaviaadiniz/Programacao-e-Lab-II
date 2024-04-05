package src.main.java.semanas3e4.recursao;

public class Exercicios {

    public static void main(String[] args) {

        System.out.println(metodo(5,3));
        System.out.println(metodo(15,3));
        System.out.println(metodo(28, -45));

    }


    public static Double metodo(double a, double b) {
        if (b <= 1) {
            return a;
        } else {
            return metodo(b, (a/b));
        }
    }

}
