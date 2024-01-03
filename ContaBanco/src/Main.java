import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scan.nextInt();

        scan.nextLine();

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque");
    }
}