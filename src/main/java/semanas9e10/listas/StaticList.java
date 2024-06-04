package src.main.java.semanas9e10.listas;

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
    public void insert(E element, int position) {

    }

    @Override
    public E remove(int position) {
        return null;
    }

    @Override
    public E get(int position) {
        return null;
    }

    @Override
    public int search(E element) {
        return 0;
    }
}
