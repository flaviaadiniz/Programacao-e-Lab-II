package src.main.java.semanas1e2.interfaces;

public class ContaPoupanca extends ContaBancaria implements Rentavel {

    private int numero = (int) Math.round(Math.random() * 100000);
    private double saldo;
    private static double taxaRendimento = 0.5;


    public ContaPoupanca(String senha) {
        super(senha);
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

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
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
        return "ContaPoupanca{" +
                "numero = " + numero +
                ", saldo = " + saldo +
                ", taxaDeRendimento = " + taxaRendimento +
                '}';
    }

    @Override
    public double calculaRendimento() {
        return this.saldo + (this.saldo * taxaRendimento);
    }
}
