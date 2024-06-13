package src.main.java.semanas9e10.listas.estaticas;

public class StaticListTest {

    public static void main(String[] args) {

        List<Integer> lista = new StaticList<>(10);

        for (int i = 0; i < 10; i++) {
            lista.insert(i*2, i);
        }

        System.out.println("Lista após inserções: ");
        System.out.println(lista);

        System.out.println("\n" + lista.remove(5) + " foi removido da lista!");

        System.out.println("\nLista após remoção do elemento na posição 5: ");
        System.out.println(lista);


        System.out.println("\nNúmero de vezes que o número 2 aparece na lista: " + lista.contaElementos(2));

    }

}
