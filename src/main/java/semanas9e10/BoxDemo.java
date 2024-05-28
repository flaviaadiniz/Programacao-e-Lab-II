package src.main.java.semanas9e10;

public class BoxDemo {

    public static void main(String[] args) {

        // desta forma, toda vez que tiver o T na classe box, ele será trocado por Integer
        Box<Integer> integerBox = new Box<>();

        integerBox.add(10);

        // se tentarmos adicionar um valor não Integer, é gerado um erro em tempo de compilação (e não execução)
        // ex: integerBox.add("10"); -> não compila!

        //solução ruim, por isso foi inventado o Generics
        Integer i = integerBox.get();

        System.out.println(i);


    }

}
