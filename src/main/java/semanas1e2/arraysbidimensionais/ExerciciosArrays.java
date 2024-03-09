package src.main.java.semanas1e2.arraysbidimensionais;


public class ExerciciosArrays {

    public static void exercicio1a() {
        int[][] array = new int[3][10];
        int valor = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = valor;
                valor++;
            }
            valor = 0;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void exercicio1b() {
        int[][] array = new int[5][10];

        int valor = 0;
        int incremento = 5;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = valor;
                if (valor == 0) {
                    valor += 1;
                } else if (valor == 1) {
                    valor += 3;
                } else {
                    valor += incremento;
                    incremento += 2;
                }

            }
            valor = 0;
            incremento = 5;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void exercicio1c() {
        int[][] array = new int[6][6];

        int valor = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = valor;
            }
            valor++;
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void exercicio1d() {
        int[][] array = new int[9][6];

        int valor = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = valor;
            }
            valor = valor == -1 ? 0 : -1;
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
