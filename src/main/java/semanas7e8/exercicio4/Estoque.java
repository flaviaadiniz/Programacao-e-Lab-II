package src.main.java.semanas7e8.exercicio4;

import java.util.Arrays;

public class Estoque {

    Produto[] produtos;

    public Estoque(Produto[] produtos) {
        this.produtos = produtos;
    }


    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }


    //refazer este método
    public Produto[] ordenaProdutosPorValor(Produto[] produtos) {
        for (int i = 1; i < produtos.length; i ++) {
            int j = i; // posição do primeiro elemento no segmento não ordenado
            double B = produtos[i].getValor(); // valor do primeiro elemento no segmento não ordenado

            // busca a posição do primeiro elemento do segmento não ordenado no segmento ordenado
            while ((j > 0) && (produtos[j-1].getValor() > B)) {
                produtos[j] = produtos[j-1];
                j--;
            }
            produtos[j] = produtos[i];
        }
        return produtos;
    }


    public Perecivel[] produtosPereciveis(Produto[] produtos) {
        int arraySize = 0;
        for (Produto produto : produtos) {
            if (produto instanceof Perecivel) {
                arraySize++;
            }
        }

        Perecivel[] pereciveis = new Perecivel[arraySize];

        int posicaoArrayPerecivel = 0;
        for (Produto produto : produtos) {
            if (produto instanceof Perecivel) {
                pereciveis[posicaoArrayPerecivel] = (Perecivel) produto;
                posicaoArrayPerecivel++;
            }
        }

        return pereciveis;
    }


    @Override
    public String toString() {
        return "Estoque {" +
                "produtos =" + Arrays.toString(produtos) +
                '}';
    }
}
