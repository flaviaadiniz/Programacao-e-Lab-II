package src.main.java.semanas3e4.recursao;

public class Lista1 {

    public static void main(String[] args) {

        char[] letters = {'F', 'L', 'A', 'V', 'I', 'A'};
        printArrayBackwards(letters);

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

}
