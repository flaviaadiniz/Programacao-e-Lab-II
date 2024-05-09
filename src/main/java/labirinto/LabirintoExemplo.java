package src.main.java.labirinto;


public class LabirintoExemplo {

    private static final int PAREDE = 1;
    private static final int CAMINHO_ABERTO = 0;
    private static final int SAIDA = 9;
    private static final int CAMINHO_SOLUCAO = 2;

    public static void main(String[] args) {
        int[][] labirinto = {
                {0, 0, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 9},
        };

        if (resolverLabirinto(labirinto, 0, 0)) {
            imprimirLabirinto(labirinto);
        } else {
            System.out.println("Sem solução.");
        }
    }

    public static boolean resolverLabirinto(int[][] labirinto, int x, int y) {
        // Verifica se a posição atual está dentro dos limites e é um caminho aberto ou a saída
        if (x >= 0 && y >= 0 && x < labirinto.length && y < labirinto[0].length &&
                (labirinto[x][y] == CAMINHO_ABERTO || labirinto[x][y] == SAIDA)) {

            // Verifica se é a saída
            if (labirinto[x][y] == SAIDA) {
                return true;
            }

            // Marca o caminho atual como parte da solução
            labirinto[x][y] = CAMINHO_SOLUCAO;

            // Tenta mover-se em cada direção (cima, baixo, esquerda, direita)
            if (resolverLabirinto(labirinto, x - 1, y) ||
                    resolverLabirinto(labirinto, x + 1, y) ||
                    resolverLabirinto(labirinto, x, y - 1) ||
                    resolverLabirinto(labirinto, x, y + 1)) {
                return true;
            }

            // Se não foi possível encontrar uma solução a partir do ponto atual, retrocede (backtrack)
            labirinto[x][y] = CAMINHO_ABERTO;
        }

        return false;
    }

    public static void imprimirLabirinto(int[][] labirinto) {
        for (int[] linha : labirinto) {
            for (int celula : linha) {
                System.out.print(celula + " ");
            }
            System.out.println();
        }
    }
}