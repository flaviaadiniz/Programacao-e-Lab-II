package src.main.java.semanas3e4.recursao;

public class Lista1 {

    public static void main(String[] args) {

        char[] letters = {'F', 'L', 'A', 'V', 'I', 'A'};
        printArrayBackwards(letters);

        System.out.println();

        double[][] biDimensionalArray = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(sumDoubles(biDimensionalArray));

    }


    // Ex 1: Crie um método recursivo que imprime um array recebido por parâmetro de trás para frente
    public static void printArrayBackwards(char[] array) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException("O array não pode ser nulo.");
        }
        printArrayBackwardsPrivate(array, array.length - 1);
    }

    private static void printArrayBackwardsPrivate(char[] array, int i) {
        if (i >= 0) {
            System.out.print(array[i]);
            printArrayBackwardsPrivate(array, i - 1);
        }
//        } else {
//            System.out.print(array[i] + " ");
//            i--;
//            printArrayBackwardsPrivate(array, i);
//        }
    }



    // Ex 2: Crie um método recursivo que recebe um array bidimensional de double e retorna a soma dos elementos deste array
    public static double sumDoubles(double[][] biDimensionalArray) throws IllegalArgumentException {
        if (biDimensionalArray == null) {
            throw new IllegalArgumentException("O array não pode ser nulo.");
        }
        return sumDoublesPrivate(biDimensionalArray, 0,0);
    }

    private static double sumDoublesPrivate(double[][] biDimensionalArray, int lines, int columns) {
        if (lines >= biDimensionalArray.length) {
            return 0;
        }

        if (columns >= biDimensionalArray[lines].length) {
            return sumDoublesPrivate(biDimensionalArray, lines+1, 0);
        }

        return biDimensionalArray[lines][columns] + sumDoublesPrivate(biDimensionalArray, lines, columns+1);
    }


}
