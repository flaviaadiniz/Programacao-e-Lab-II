package src.main.java.semanas9e10.filas;

import src.main.java.semanas9e10.classeslab2.OverflowException;
import src.main.java.semanas9e10.classeslab2.UnderflowException;

public class StaticQueueTest {

    public static void main(String[] args) {

        StaticQueue<Integer> q = new StaticQueue<>(5);

        try {
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);

            q.dequeue();
            q.dequeue();

            q.enqueue(5);
            q.enqueue(6);
            q.enqueue(7);
        } catch (OverflowException e) {
            System.out.println(e);
        } catch (UnderflowException e)
        {
            System.out.println(e);
        }



    }

}
