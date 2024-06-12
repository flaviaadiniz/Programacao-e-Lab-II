package src.main.java.semanas9e10.filas;

import src.main.java.semanas9e10.classeslab2.OverflowException;
import src.main.java.semanas9e10.classeslab2.UnderflowException;

public interface Queue<E> {

    // returns the number of elements in the queue
    int numElements();

    // returns whether the queue is empty
    boolean isEmpty();

    // returns whether the queue is full
    boolean isFull();

    // inspects the element at the front of the queue
    E front() throws UnderflowException;

    // inspects the element at the back of the queue
    E back() throws UnderflowException;

    // inserts an element at the rear of the queue
    void enqueue(E element) throws OverflowException;

    // removes que telement at the front of the queue
    E dequeue() throws UnderflowException;



}
