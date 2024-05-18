package src.main.java.semanas3e4;

public class Lista1 {

    public static void main(String[] args) {

        char[] letters = {'F', 'L', 'A', 'V', 'I', 'A'};
        printArrayBackwards(letters);

        System.out.println();

        double[][] biDimensionalArray = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(sumDoubles(biDimensionalArray));

        System.out.println();

        int[] intArray = {23, 35, 16, 8, 13, 11, 10, 20, 9, 12};
        System.out.println(findPositionOfLowerValue(intArray));

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


    /*
    Crie um método chamado encontraPosicaoMenorValor. Este método deve encontrar a posição do menor valor de um array de inteiros V
    (recebido por parâmetro). Por exemplo, digamos que o array abaixo seja passado por parâmetro:
    {23, 35, 16, 8, 13, 11, 10, 20, 9, 12} - O método, neste caso, retornaria o valor 3
     */
    public static int findPositionOfLowerValue(int[] intArray) {
        if (intArray == null) {
            throw new IllegalArgumentException("O array não pode ser nulo.");
        }
        return findPositionOfLowerValuePrivate(intArray, 0, 0);
    }

    private static int findPositionOfLowerValuePrivate(int[] intArray, int counter, int position) {
        if (counter < intArray.length - 1) {
            if (intArray[counter] < intArray[position]) {
                position = counter;
            }
            return findPositionOfLowerValuePrivate(intArray, counter + 1, position);
        }

        return position;
    }


}
