package src.main.java.semanas7e8.exercicio4;

public class NaoPerecivel extends Produto {

    private int quantidadeEstoque;


    public NaoPerecivel(String nome, String descricao, Double valor, int quantidadeEstoque) {
        super(nome, descricao, valor);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    @Override
    public String toString() {
        return super.toString() +
                " - NaoPerecivel {" +
                "quantidadeEstoque = " + quantidadeEstoque +
                "}\n";
    }
}
