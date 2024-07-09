package src.main.java.semanas9e10;

import src.main.java.semanas9e10.classeslab2.OverflowException;
import src.main.java.semanas9e10.classeslab2.UnderflowException;
import src.main.java.semanas9e10.filas.Queue;
import src.main.java.semanas9e10.filas.StaticQueue;
import src.main.java.semanas9e10.pilhas.StaticStack;

public class Exercicio2 {


    public static void main(String[] args) {

        StaticStack<Integer> stackInt = new StaticStack<>(8);
        Queue<Integer> queueInt = new StaticQueue<>(2);

        try {
            for (int i = 10, j = 0; i > -3; i--, j++) {
                queueInt.enqueue(j-i);
                stackInt.push(queueInt.dequeue());
                queueInt.enqueue(stackInt.pop() * -1);
            }
        } catch (UnderflowException e) {
            e.printStackTrace();
        } catch (OverflowException e) {
            e.printStackTrace();
        }

        StaticQueue<String> queueStr = new StaticQueue<>(stackInt.numElements() + queueInt.numElements());

        while (!stackInt.isEmpty()) {
            queueStr.enqueue(stackInt.pop() + " - " + queueInt.dequeue());
        }

        System.out.println(queueStr);
    }

}
