import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)throws Exception {
        // Criando o Scanner para capturar dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo mensagens para o usuário
        System.out.println("Bem-vindo ao nosso sistema de contas!");
        System.out.print("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt(); // Captura o número da conta

        System.out.print("Digite o tipo da conta (exemplo: corrente, poupança): ");
        scanner.nextLine(); // Limpar o buffer do scanner
        String tipoConta = scanner.nextLine(); // Captura o tipo da conta

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble(); // Captura o saldo da conta

        System.out.print("Digite o titular da conta: ");
        scanner.nextLine(); // Limpar o buffer do scanner
        String titular = scanner.nextLine(); // Captura o nome do titular

        // Exibindo a mensagem de conta criada com os dados
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da conta: R$ " + saldo);
        System.out.println("Titular da conta: " + titular);
        
        // Fechar o scanner
        scanner.close();
        
    }
}