package src.main.java.semanas9e10.pilhas;

import src.main.java.semanas9e10.classeslab2.OverflowException;
import src.main.java.semanas9e10.classeslab2.UnderflowException;

public interface Stack<E> {

    // returns the number of elemtns in the stack
    int numElements();

    // returns whether the stack is empty
    boolean isEmpty();

    // returns whether the stack is full
    boolean isFull();

    // inspects the element at the top of the stack
    E top() throws UnderflowException;

    // inserts an element at the top of the stack
    void push(E element) throws OverflowException;

    // removes the top element from the stack
    E pop() throws UnderflowException;

}
