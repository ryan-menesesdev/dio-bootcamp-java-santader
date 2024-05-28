import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Boas vindas ao seu Terminal Bancário!\n");
            System.out.println("Digite seu nome, por favor!");
            String nomeCliente = input.nextLine();

            System.out.println("\nDigite o número da sua Agência: ");
            int numeroAgencia = input.nextInt();

            System.out.println("\nDigite o número da sua Conta: ");
            int numeroConta = input.nextInt();

            System.out.println("\nPor fim, digite o Saldo desejado para saque: ");
            double valorSaldo = input.nextDouble();

            System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " + numeroAgencia + ", Conta " + numeroConta + " e seu Saldo " + valorSaldo + " já está disponível para saque!");
        }
    }
}
