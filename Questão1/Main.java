package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numero = entrada.nextInt();

        System.out.print("Informe a agência: ");
        int agencia = entrada.nextInt();

        ContaCorrente contaCorrente = new ContaCorrente(numero, agencia);

        System.out.print("Informe o valor para depósito: ");
        double deposito = entrada.nextDouble();

        contaCorrente.depositar(deposito);

        System.out.println("\nDados da conta:");
        contaCorrente.exibe();

        System.out.print("\nInforme o valor para saque: ");
        double saque = entrada.nextDouble();

        contaCorrente.sacar(saque);

        System.out.println("\nDados da conta após o saque:");
        contaCorrente.exibe();

        entrada.close();
    }
}
