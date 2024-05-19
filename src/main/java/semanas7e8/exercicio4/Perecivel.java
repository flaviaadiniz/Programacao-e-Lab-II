package src.main.java.semanas7e8.exercicio4;

public class Perecivel extends Produto {

    private Data dataValidade;


    public Perecivel(String nome, String descricao, Double valor, Data dataValidade) {
        super(nome, descricao, valor);
        this.dataValidade = dataValidade;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }


    @Override
    public String toString() {
        return super.toString() +
                " - Perecivel {" +
                "dataValidade: " + dataValidade +
                "}\n";
    }
}
