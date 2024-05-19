package src.main.java.semanas7e8.exercicio4;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        Produto produto1 = new Perecivel("Carne", "bife alcatra", 49.9,
                new Data("12", "06", "2024"));

        Produto produto2 = new Perecivel("Sanduíche", "sanduíche de presunto", 10.0,
                new Data("20", "05", "2024"));

        Produto produto3 = new Perecivel("Queijo", "queijo mussarela", 7.50,
                new Data("22", "05", "2024"));

        Produto produto4 = new NaoPerecivel("Arroz", "arroz branco", 6.9, 10);

        Produto produto5 = new NaoPerecivel("Feijão", "feijão vermelho", 9.9, 50);

        Produto produto6 = new NaoPerecivel("Massa", "massa parafuso", 4.8, 100);


        Produto[] produtos = {produto1, produto2, produto3, produto4, produto5, produto6};


        Estoque estoque = new Estoque(produtos);

        System.out.println(Arrays.toString(estoque.ordenaProdutosPorValor(produtos)));

//        System.out.println(Arrays.toString(estoque.produtosPereciveis(produtos)));


    }

}
