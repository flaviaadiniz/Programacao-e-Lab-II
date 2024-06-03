package src.main.java.semanas9e10.listas;

public class StaticList<E> implements List<E> {

    protected E[] elements;
    int numElements;

    @Override
    public int numElements() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
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
