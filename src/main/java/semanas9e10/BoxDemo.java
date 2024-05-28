package src.main.java.semanas9e10;

public class BoxDemo {

    public static void main(String[] args) {

        // desta forma, toda vez que tiver o T na classe box, ele será trocado por Integer
        Box<Integer> integerBox = new Box<>();

        integerBox.add(10);

        //solução ruim, por isso foi inventado o Generics
        Integer i = integerBox.get();

        System.out.println(i);


    }

}
