package src.main.java.semanas1e2.arraysbidimensionais;

import java.util.Scanner;

public class ExerciciosArrays {

    public static void exercicio1a() {
        int[][] array = new int[3][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j;
            }
        }

        printArray(array);
    }


    public static void exercicio1b() {
        int[][] array = new int[5][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               array[i][j] = j*j;
            }
        }

        printArray(array);
    }


    public static void exercicio1c() {
        int[][] array = new int[6][6];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i;
            }
        }

        printArray(array);
    }


    public static void exercicio1d() {
        int[][] array = new int[9][6];

        int valor = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = valor;
            }
            valor = valor == -1 ? 0 : -1;
        }

        printArray(array);
    }


    public static void exercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos criar uma matriz bidimensional de números inteiros!");
        System.out.print("Digite a quantidade de linhas da matriz: ");
        int arrayLines = scanner.nextInt();
        System.out.print("Digite a quantidade de números em cada linha: ");
        int arrayColumns = scanner.nextInt();

        int[][] array = new int[arrayLines][arrayColumns];

        for (int i = 0; i < arrayLines; i++) {
            for (int j = 0; j < arrayColumns; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        printArray(array);
    }




    // static method to print bidimensional arrays
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
