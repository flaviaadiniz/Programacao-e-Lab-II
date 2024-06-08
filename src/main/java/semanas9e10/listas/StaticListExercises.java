package src.main.java.semanas9e10.listas;

import java.util.Arrays;

public class StaticListExercises {

    public static void main(String[] args) {

        StaticList<Integer> listInteger = new StaticList<>(10);

        for (int i = 0; i < 10; i++) {
            listInteger.insert(i, i);
        }

        System.out.println(Arrays.toString(listInteger.evenNumbers(listInteger)));


        StaticList<Character> listChar = new StaticList<>(6);

        StaticList<Character> t1 = new StaticList<>(3);
        t1.insert('A', 0);
        t1.insert('B', 1);
        t1.insert('C', 2);

        StaticList<Character> t2 = new StaticList<>(3);
        t2.insert('D', 0);
        t2.insert('E', 1);
        t2.insert('F', 2);


        System.out.println(listChar.mergeLists(t1, t2));


    }


}
