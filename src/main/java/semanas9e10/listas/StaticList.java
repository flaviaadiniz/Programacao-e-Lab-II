package src.main.java.semanas9e10.listas;

import java.util.Arrays;

public class StaticList<E> implements List<E> {

    protected E[] elements;
    int numElements;

    public StaticList(int maxSize) {
        elements = (E[]) new Object[maxSize];
        numElements = 0;
    }

    @Override
    public int numElements() {
        return numElements;
    }

    @Override
    public boolean isEmpty() {
        return numElements == 0;
    }

    @Override
    public boolean isFull() {
        return numElements == elements.length;
    }

    @Override
    public void insert(E element, int position) throws OverflowException, IndexOutOfBoundsException {

        // verifica se há espaço na lista
        if (isFull()) {
            throw new OverflowException();
        }

        // verifica se a posição é válida
        if (position < 0 || position > numElements) {
            throw new IndexOutOfBoundsException();
        }

        // desloca para a direita os elementos necessários, abrindo espaço para o novo
        for (int i = numElements - 1; i >= position; i--) {
            elements[i+1] = elements[i];
        }

        // armazena o novo elemento e ajusta o total
        elements[position] = element;
        numElements++;

    }

    @Override
    public E remove(int position) throws UnderflowException, IndexOutOfBoundsException {

        // verifica se a lista está vazia
        if (isEmpty()) {
            throw new UnderflowException();
        }

        // guarda uma referência temporária ao elemento removido
        E element = elements[position];

        // desloca para a esquerda os elementos necessários, sobrescrevendo a posição do que está sendo removido
        for (int i = position; i < numElements - 1; i++) {
            elements[i] = elements[i+1];
        }

        // define para null a posição antes ocupada pelo último, para que a coleta de lixo possa atuar e ajusta o total
        elements[numElements - 1] = null;
        numElements--;

        return element;

    }

    @Override
    public E get(int position) throws IndexOutOfBoundsException {

        // verifica se a posição é válida
        if (position < 0 || position >= numElements) {
            throw new IndexOutOfBoundsException();
        }
        return elements[position];

    }

    @Override
    public int search(E element) {
        for (int i = 0; i < numElements; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }

        // se chegar até aqui, é porque não encontrou o elemento
        return -1;
    }

    @Override
    public String toString() {
        return "StaticList {" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }


    // -------------- exercícios de programação e laboratório -------------- //


    /*
    Na classe que representa uma lista estática (classe criada em aula), implemente um método RECURSIVO que recebe um
    elemento por parâmetro e retorna a quantidade de vezes que este elemento aparece na lista. Você deve fazer os métodos
    público e privado. Você deve utilizar a seguinte assinatura do método público:
    public int contaElementos(E el) throws IllegalArgumentException
    */

    @Override
    public int contaElementos(E elemento) throws IllegalArgumentException {
        if (elemento == null) {
            throw new IllegalArgumentException("Elemento não pode ser nulo!");
        }

        return contaElementosPrivado(elemento, numElements, 0);
    }

    private int contaElementosPrivado(E elemento, int numElements, int contador) {
        if (numElements == 0) {
            return contador;
        }

        if (elements[numElements - 1] == elemento) {
            contador++;
        }

        numElements--;

        return contaElementosPrivado(elemento, numElements, contador);
    }

}
