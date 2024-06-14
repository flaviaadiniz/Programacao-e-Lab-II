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
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == elements.length - 1;
    }

    @Override
    public E top() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        return elements[top];
    }

    @Override
    public void push(E element) throws OverflowException {
        if (!isFull()) {
            elements[++top] = element;
        } else {
            throw new OverflowException();
        }

    }

    @Override
    public E pop() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        E element = elements[top];
        elements[top--] = null;
        return element;
    }


    @Override
    public String toString() {
        if (isEmpty())
            return "[Empty]";
        else {
            String s = "[";
            for (int i = numElements() - 1; i >= 0; i--) {
                s += "\n" + elements[i];
            }
            s += "\n]";
            return s;
        }
    }

}
