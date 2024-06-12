package src.main.java.semanas9e10.pilhas;

import src.main.java.semanas9e10.classeslab2.OverflowException;
import src.main.java.semanas9e10.classeslab2.UnderflowException;

public class StaticStack<E> implements Stack<E> {

    protected int top;

    protected E elements[];

    public StaticStack(int maxSize) {
        elements = (E[])new Object[maxSize];
        top = -1;
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
    public E top() throws UnderflowException {
        return null;
    }

    @Override
    public void push(E element) throws OverflowException {

    }

    @Override
    public E pop() throws UnderflowException {
        return null;
    }

}
