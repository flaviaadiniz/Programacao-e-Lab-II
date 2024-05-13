package src.main.java.semanas7e8;

public class PesquisaSequencial {

    public static void main(String[] args) {

        int[] numerosNaoOrdenados = {5, 20, 10, 9, 2, 15, 7, 4, 20, 6};
        int[] numerosOrdenados = {2, 4, 5, 7, 9, 10, 12, 13, 15, 16};

        System.out.println(pesquisaSequencial(numerosNaoOrdenados, 4));
        System.out.println(pesquisaSequencialOrdenada(numerosOrdenados, 4));

    }

    public static int pesquisaSequencial(int[] numeros, int alvo) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == alvo) {
                return i;
            }
        }
        return -1;
    }

    /* pesquisa sequencial ordenada é sempre mais rápida quando o número procurado NÃO está no array, pois a pesquisa para
    quando ela chega em um número maior do que o procurado - este método só funciona para array ordenado! */
    public static int pesquisaSequencialOrdenada(int[] numeros, int alvo) {
        for (int i = 0; (i < numeros.length) && (numeros[i] <= alvo); i++) {
            if (numeros[i] == alvo) {
                return i;
            }
        }
        return -1;
    }

}
