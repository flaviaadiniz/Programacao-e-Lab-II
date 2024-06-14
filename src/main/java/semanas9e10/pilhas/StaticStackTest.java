package src.main.java.semanas9e10.pilhas;

import src.main.java.semanas9e10.classeslab2.OverflowException;
import src.main.java.semanas9e10.classeslab2.UnderflowException;

public class StaticStackTest {


    public static void main(String[] args) {

        StaticStack<Integer> s = new StaticStack<>(10);


        try {
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
        } catch (OverflowException e) {
            System.out.println(e);
        }

        System.out.println(s);


        // método que imprime todos os elementos (e vai tirando eles)
        try {
            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }
        } catch (UnderflowException e) {
            System.out.println(e);
        }


    }

}
