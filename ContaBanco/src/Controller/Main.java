package Controller;

import Model.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o seu nome:");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o saldo inicial:");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("\nOlá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");

        scanner.close();
    }
}