package src.main.java.semanas9e10.listas.estaticas;

import java.util.Arrays;

public class StaticListExercises {

    public static void main(String[] args) {

        // evenNumbers()
        StaticList<Integer> listInteger = new StaticList<>(10);

        for (int i = 0; i < 10; i++) {
            listInteger.insert(i, i);
        }

        System.out.println(Arrays.toString(listInteger.evenNumbers(listInteger)));


        // mergeLists()
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


        // postpendList()
        StaticList<Double> doubleList1 = new StaticList<>(6);
        doubleList1.insert(1.0, 0);
        doubleList1.insert(2.0, 1);
        doubleList1.insert(3.0, 2);

        StaticList<Double> doubleList2 = new StaticList<>(3);
        doubleList2.insert(4.0, 0);
        doubleList2.insert(5.0, 1);
        doubleList2.insert(6.0, 2);

        doubleList1.postpendList(doubleList1, doubleList2);
        System.out.println(doubleList1);


        // prependList()
        StaticList<Double> doubleList3 = new StaticList<>(6);
        doubleList3.insert(1.0, 0);
        doubleList3.insert(2.0, 1);
        doubleList3.insert(3.0, 2);

        StaticList<Double> doubleList4 = new StaticList<>(3);
        doubleList4.insert(4.0, 0);
        doubleList4.insert(5.0, 1);
        doubleList4.insert(6.0, 2);

        doubleList3.prependList(doubleList3, doubleList4);
        System.out.println(doubleList3);


    }


}
