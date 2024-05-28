package src.main.java.semanas9e10;

public class BoxDemo {

    public static void main(String[] args) {

        Box integerBox = new Box();

        integerBox.add(10);

        //solução ruim, por isso foi inventado o Generics
        Integer i = (Integer) integerBox.get();

        System.out.println(i);


    }

}
