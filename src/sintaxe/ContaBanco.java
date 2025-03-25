package sintaxe;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Digite o número da Conta");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da Agência");
        agencia = scanner.nextLine();

        System.out.println("Digite o seu Nome");
        nome = scanner.nextLine();

        System.out.println("Digite o saldo da conta");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta +
                " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque");

    }
}
