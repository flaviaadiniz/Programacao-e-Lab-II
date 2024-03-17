package src.main.java.semanas1e2.arraysbidimensionais;

import java.util.Arrays;

public class PrincipalArrays {

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


        System.out.println("\n-- Exercício 5 --");
        double[][] array2 = new double[3][3];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = Math.round(Math.random() * 100);
            }
        }
        System.out.println(ExerciciosArrays.exercicio5(array2));
        System.out.println();


        System.out.println("\n-- Exercício 6 --");
        double[][] array3 = new double[2][2];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = Math.round(Math.random() * 100);
            }
        }
        System.out.println(ExerciciosArrays.exercicio6(array3));
        System.out.println();


        System.out.println("\n-- Exercício 7 --");
        int[][] array4 = new int[5][5];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
        System.out.println("A soma dos números da matriz é: " + ExerciciosArrays.exercicio7(array4));
        System.out.println();


        System.out.println("\n-- Exercício 8 --");
        double[][] array5 = new double[5][5];
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = Math.round(Math.random() * 100);
            }
        }
        System.out.println("A média dos números da matriz é: " + ExerciciosArrays.exercicio8(array5));
        System.out.println();


        System.out.println("\n-- Exercício 9 --");
        System.out.println(Arrays.deepToString(ExerciciosArrays.exercicio9()));


        System.out.println("\n-- Exercício 10 --");
        int[][] array6 = {{-1, 3, 10, -8, 35}, {97, -3, 10, -88, 5}, {9, 4, -4, 12, 27}};
        System.out.println("Array unidimensional de inteiros: " + Arrays.toString(ExerciciosArrays.exercicio10(array6)));
        System.out.println();

    }

}
