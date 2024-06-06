package src.main.java.semanas9e10.listas;

import java.util.Arrays;

public class StaticListTest {

    public static void main(String[] args) {

        List<Integer> lista = new StaticList<>(10);

        for (int i = 0; i < 10; i++) {
            lista.insert(i*2, i);
        }


        System.out.println("Lista após inserções: ");
        System.out.println(lista.toString());

        System.out.println(lista.remove(5) + " foi removido da lista!");

        System.out.println("Lista após remoção do elemento na posição 5: ");
        System.out.println(lista.toString());

    }

}
