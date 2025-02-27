import java.util.Scanner;
public class ContaTerminal {
    // Atributos da conta bancária
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Método para ler os dados do terminal
    public void lerDados() {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();

        // Limpa o buffer do teclado
        scanner.nextLine(); // Para consumir a nova linha após nextInt()

        // Solicita e lê a agência
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo da conta
        System.out.print("Por favor, digite o saldo da Conta: ");
        saldo = scanner.nextDouble();
    }

    // Método para exibir a mensagem final
    public void exibirMensagem() {
        // Mensagem final com a concatenação dos dados inseridos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " +
                saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }

}
