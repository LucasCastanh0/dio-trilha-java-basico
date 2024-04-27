import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu número: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();
        String sobrenome = scanner.next();
        String nomeCliente = nome + " " + sobrenome;

        System.out.println("Por favor, digite seu Saldo R$");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível.");
    }
}
