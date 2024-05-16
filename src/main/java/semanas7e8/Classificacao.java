package src.main.java.semanas7e8;

public class Classificacao {

    // * também chamado de ORDENAÇÃO, é o processo de organizar itens em ordem, segundo algum critério
    // * aplicações:
    // - preparação de dados para facilitar pesquisas futuras
    // - agrupar itens que apresentam mesmos valores, para eliminar os repetidos
    // - batimento entre itens presentes em mais de um arquivo

    // * um algoritmo de classificação é ESTÁVEL se ele preserva a ordem relativa original dos registros com mesmo valor de chave

    public static void main(String[] args) {

    }


    // * Inserção Direta: divide o array em 2 segmentos: o primeiro com os elementos já ordenados, o segundo com os
    //   elementos ainda não ordenados
    // * pega o primeiro elemento do segmento não ordenado e procura seu lugar no segmento ordenado

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i ++) {
            int j = i; // posição do primeiro elemento no segmento não ordenado
            int B = array[i]; // primeiro elemento no segmento não ordenado

            // busca a posição do primeiro elemento do segmento não ordenado no segmento ordenado
            while ((j > 0) && (array[j-1] > B)) {
                array[j] = array[j-1];
                j--;
            }

            array[j] = B;
        }
    }


    // Bubblesort (Método da bolha): compara sempre de 2 em 2 e coloca o de valor menor na 1a posição entre as duas
    // * é necessário mais de uma varredura - na primeira varredura, o maior valor sempre fica por último!

    public static void bubbleSort(int[] array) {
        int i = array.length - 1;

        while (i > 0) {
            int lastFlipped = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) { // troca par de posição
                    int T = array[j];
                    array[j] = array[j+1];
                    array[j+1] = T;
                    lastFlipped = j;
                }
            }
            i = lastFlipped;
        }
    }


}
