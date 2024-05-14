package src.main.java.semanas7e8;

public class PesquisaBinaria {

    // * método para ser aplicado em arrays ordenados - reduz o número de elementos a serem considerados pela metade

    // * compara-se o argumento (arg) de pesquisa com o elemento localizado no índice médio do array

    // * se o arg for maior do que o elemento do índice médio, o processo é repetido para a metade superior do array

    // * se for menor, para a metade inferior

    // * se for igual, a busca se encerra com sucesso

    // ** a área de pesquisa é reduzida à metade do número de elementos a cada vez ** //

    public static void main(String[] args) {

        int[] numerosOrdenados = {21, 32, 43, 54, 65, 76, 87, 98, 109, 200};

        System.out.println(pesquisaBinaria(numerosOrdenados, 43));

    }

    public static int pesquisaBinaria(int[] numeros, int alvo) {
        int inf = 0;
        int sup = numeros.length - 1;

        while (inf <= sup) {
            int med = (inf + sup) / 2; // divisão inteira

            if (alvo == numeros[med]) {
                return med;
            } else if (alvo < numeros[med]) {
                sup = med - 1; // procura na primeira metade
            } else {
                inf = med + 1; // procura na segunda metade
            }
        }
        return -1;

    }



}
