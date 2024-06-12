package src.main.java.semanas9e10.filas;

import src.main.java.semanas9e10.classeslab2.OverflowException;
import src.main.java.semanas9e10.classeslab2.UnderflowException;

public class StaticQueue<E> implements Queue<E> {


    protected int first;

    protected int last;

    protected E elements[];


    public StaticQueue(int maxSize) {
        elements = (E[]) new Object[maxSize];
        first = last =-1;
    }


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
    public E front() throws UnderflowException {
        return null;
    }

    @Override
    public E back() throws UnderflowException {
        return null;
    }

    @Override
    public void enqueue(E element) throws OverflowException {

    }

    @Override
    public E dequeue() throws UnderflowException {
        return null;
    }
}
