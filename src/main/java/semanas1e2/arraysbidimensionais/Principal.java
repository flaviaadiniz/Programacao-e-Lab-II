package src.main.java.semanas1e2.arraysbidimensionais;

public class Principal {

    public static void main(String[] args) {

        System.out.println("-- Exercício a --");
        ExerciciosArrays.exercicio1a();
        System.out.println();

        System.out.println("-- Exercício b --");
        ExerciciosArrays.exercicio1b();
        System.out.println();

        System.out.println("-- Exercício c --");
        ExerciciosArrays.exercicio1c();
        System.out.println();

        System.out.println("-- Exercício d --");
        ExerciciosArrays.exercicio1d();
        System.out.println();

        System.out.println("\n-- Exercício 2 --");
        ExerciciosArrays.exercicio2();
        System.out.println();

        System.out.println("\n-- Exercício 3 --");
        ExerciciosArrays.exercicio3();
        System.out.println();

        System.out.println("\n-- Exercício 4 --");
        double[][] array = new double[3][5];
        System.out.println("O array tem " + ExerciciosArrays.exercicio4(array) + " elementos.");
        System.out.println();

    }

}
