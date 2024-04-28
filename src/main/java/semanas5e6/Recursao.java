package src.main.java.semanas5e6;

public class Recursao {

    public static void main(String[] args) {

        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //imprimeArrayInvertido(valores, 5); - stack overflow

        metodoRecursivo(6);

        System.out.println();


        Aluno[] alunos = {new Aluno("Aluno 0", 5.5),
                new Aluno("Aluno 1", 3.3),
                new Aluno("Aluno 2", 4.9),
                new Aluno("Aluno 3", 9.8),
                new Aluno("Aluno 4", 7.4)};

        System.out.println(recursaoAluno(alunos, 0, 0));

        System.out.println();


        System.out.println(metodo(2));
        System.out.println(metodo(3));

    }

    public static void metodoRecursivo(int x) {
        if (x == 0) {
            System.out.println("Fim do programa");
        } else {
            metodoRecursivo(x - 3);
        }
        System.out.println(x);
    }

    public static void imprimeArrayInvertido(int[] array, int i) {
        if(i >= 0) {
            System.out.println(array[i]+" ");
            imprimeArrayInvertido(array, i--);
        }
    }

    public static int recursaoAluno(Aluno[] alunos, int i, int posicaoMelhorNota) {
        if(i >= alunos.length) {
            return 0;
        }
        if(alunos[i].getMediaFinal() > alunos[posicaoMelhorNota].getMediaFinal()) {
            posicaoMelhorNota = i;
        }
        return recursaoAluno(alunos, i+1, posicaoMelhorNota);
    }

    public static int metodo(int n) throws IllegalArgumentException{
        if(n <= 0) throw new IllegalArgumentException();
        return metodo_recursivo(n);
    }

    private static int metodo_recursivo(int n) {
        if(n == 1) return 2;
        return 3 * metodo_recursivo(n-1) + 1;
    }


}
