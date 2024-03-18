package src.main.java.semanas1e2.interfaces;

import java.util.Scanner;

public abstract class ContaBancaria {

    private String senha;


    public ContaBancaria(String senha) {
        this.senha = senha;
    }


    abstract void saca(double valor);
    abstract void deposita(double valor);
    abstract void tiraExtrato();


    void alteraSenha(String senha) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha atual: ");
        String senhaAtual = scanner.nextLine();

        if (senhaAtual.equals(this.senha)) {
            System.out.println("Digite a nova senha: ");
            this.senha = scanner.nextLine();
        } else {
            System.out.println("Senha incorreta!");
        }
    }

}
