package src.main.java.semanas9e10.listas;

import java.nio.BufferUnderflowException;
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
    public void insert(E element, int position) throws StackOverflowError, IndexOutOfBoundsException {

        // verifica se há espaço na lista
        if (isFull()) {
            throw new StackOverflowError();
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
    public E remove(int position) throws BufferUnderflowException, IndexOutOfBoundsException {

        // verifica se a lista está vazia
        if (isEmpty()) {
            throw new BufferUnderflowException();
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
    public E get(int position) {
        return null;
    }

    @Override
    public int search(E element) {
        return 0;
    }

    @Override
    public String toString() {
        return "StaticList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
