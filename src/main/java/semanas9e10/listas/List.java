package src.main.java.semanas9e10.listas;

public interface List<E> {

    int numElements();

    boolean isEmpty();

    boolean isFull();

    void insert(E element, int position);

    E remove (int position);

    E get(int position);

    int search(E element);

    // --- métodos criados nos exercícios de programação e laboratório --- //

    int contaElementos(E elemento);

    Integer[] evenNumbers(List<Integer> lista);

}
