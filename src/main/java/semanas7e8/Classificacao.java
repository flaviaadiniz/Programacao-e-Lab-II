package src.main.java.semanas7e8;

import java.util.Arrays;

public class Classificacao {

    // * também chamado de ORDENAÇÃO, é o processo de organizar itens em ordem, segundo algum critério
    // * aplicações:
    // - preparação de dados para facilitar pesquisas futuras
    // - agrupar itens que apresentam mesmos valores, para eliminar os repetidos
    // - batimento entre itens presentes em mais de um arquivo

    // * um algoritmo de classificação é ESTÁVEL se ele preserva a ordem relativa original dos registros com mesmo valor de chave

    public static void main(String[] args) {

        int[] array1 = {4, -3, 18, 22, 5, 0, 1, 47, -2, 9};

        bubbleSort(array1);
        insertionSort(array1);
        selectionSort(array1);

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        insertionSort(a);
        bubbleSort(a);
        selectionSort(a);


    }


    // * Inserção Direta: divide o array em 2 segmentos: o primeiro com os elementos já ordenados, o segundo com os
    //   elementos ainda não ordenados
    // * pega o primeiro elemento do segmento não ordenado e procura seu lugar no segmento ordenado
    // ** ESTÁVEL

    public static void insertionSort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i ++) {
            int j = i; // posição do primeiro elemento no segmento não ordenado
            int B = array[i]; // primeiro elemento no segmento não ordenado

            // busca a posição do primeiro elemento do segmento não ordenado no segmento ordenado
            while ((j > 0) && (array[j-1] > B)) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = B;
            System.out.println(Arrays.toString(array));
        }
    }


    // Bubblesort (Método da bolha): compara sempre de 2 em 2 e coloca o de valor menor na 1a posição entre as duas
    // * é necessário mais de uma varredura - na primeira varredura, o maior valor sempre fica por último!
    // ** ESTÁVEL

    public static void bubbleSort(int[] array) {
        System.out.println(Arrays.toString(array));
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
            System.out.println(Arrays.toString(array));
            i = lastFlipped;
        }
    }


    // Seleção Direta: a seleção do menor elemento é feita por pesquisa sequencial
    // - o menor elemento encontrado é permutado com o que ocupa a posição inicial do array
    // - o processo de seleção é repetido para a parte restante do array, até que todos os elementos tenham sido selecionados
    //   e colocados em suas posições definitivas
    // ** NÃO ESTÁVEL


    public static void selectionSort(int[] array) {
        System.out.println(Arrays.toString(array));
        int min = 0;

        for (int i = 0; i <array.length - 1; i++) {
            min = i; // mínimo inicial
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j; // acha o novo mínimo
                }
            }
            int T = array[i]; // coloca o novo mínimo (min) na posição correta (i)
            array[i] = array[min];
            array[min] = T;
            System.out.println(Arrays.toString(array));
        }
    }

}
