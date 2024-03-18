package src.main.java.semanas1e2.interfaces;

public class ContaCorrente extends ContaBancaria {

    private int numero = (int) Math.round(Math.random() * 100000);
    private double saldo;
    private int quantTransacoes;


    public ContaCorrente(String senha) {
        super(senha);
        this.saldo = 0;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getQuantTransacoes() {
        return quantTransacoes;
    }

    public void setQuantTransacoes(int quantTransacoes) {
        this.quantTransacoes = quantTransacoes;
    }

    @Override
    void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    void tiraExtrato() {
        System.out.println("Extrato: " + this.saldo);
    }


    @Override
    public String toString() {
        return "ContaCorrente {" +
                "numero = " + numero +
                ", saldo = " + saldo +
                ", quantTransacoes = " + quantTransacoes +
                '}';
    }
}
