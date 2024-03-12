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

        printArrayInt(array);
    }


    public static void exercicio1b() {
        int[][] array = new int[5][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               array[i][j] = j*j;
            }
        }

        printArrayInt(array);
    }


    public static void exercicio1c() {
        int[][] array = new int[6][6];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i;
            }
        }

        printArrayInt(array);
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

        printArrayInt(array);
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

        printArrayInt(array);
    }


    public static void exercicio3() {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[2][5];

        System.out.println("Vamos criar uma matriz bidimensional com 10 elementos (5 por linha).");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Digite um valor: ");
                array[i][j] = scanner.nextDouble();
            }
        }

        printArrayDouble(array);
    }


    public static int exercicio4(double[][] array) {
        int elements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                elements++;
            }
        }
        return elements;
    }

    /*
    Exercício 6: Crie um método que recebe uma matriz de double e retorna um String de saída
para ela, com seus valores separados por um hífen, mas mantendo o formato da matriz. Por
exemplo, para a matriz de entrada abaixo:
     */

    public static String exercicio5(double[][] array) {
        String arrayString = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayString += j == array[i].length -1 ? array[i][j] + "\n" : array[i][j] + " - ";

            }
        }
        return arrayString;
    }

    public static double exercicio6(double[][] array) {
        double highestValue = 0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                highestValue = Math.max(array[i][j], highestValue);
            }
        }
        return highestValue;
    }



    // static method to print bidimensional arrays of int
    private static void printArrayInt(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // static method to print bidimensional arrays of double
    private static void printArrayDouble(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
