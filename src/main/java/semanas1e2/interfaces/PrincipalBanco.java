package src.main.java.semanas1e2.interfaces;

import java.util.Arrays;
import java.util.Scanner;

public class PrincipalBanco {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas contas você deseja criar? ");
        int numContas = scanner.nextInt();
        scanner.nextLine();

        ContaBancaria[] contas = new ContaBancaria[numContas];

        for (int i = 0; i < contas.length; i++) {

            System.out.print("Para criar uma Conta Corrente digite 1. Para criar uma Conta Poupança digite 2. ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 :
                    System.out.print("Digite a senha da nova conta: ");
                    String senha = scanner.nextLine();
                    ContaCorrente contaCorrente = new ContaCorrente(senha);
                    contas[i] = contaCorrente;
                    break;
                case 2:
                    System.out.print("Digite a senha da nova conta: ");
                    String senha2 = scanner.nextLine();
                    ContaPoupanca contaPoupanca = new ContaPoupanca(senha2);
                    contas[i] = contaPoupanca;
                    break;
            }
        }

        System.out.println(Arrays.toString(contas));




        scanner.close();

    }

}
