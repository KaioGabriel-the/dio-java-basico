import java.util.Scanner;

/**<h2>Classe ContaTerminal</h2>
 * <p>Esta classe é responsável por interagir com o usuário para coletar
 * informações sobre a conta bancária e exibir uma mensagem de confirmação.</p>
 * @author Kaio Gabriel
 * @since 02.20.23
 * @version 1.0
 */
public class ContaTerminal {

    /**
     * <h2>Método main</h2>
     * <p>Este é o ponto de entrada da aplicação. Ele solicita que o usuário
     * insira os detalhes da conta e, em seguida, imprime uma mensagem de
     * confirmação com as informações fornecidas.</p>
     * @param args Argumentos da linha de comando (não utilizado).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número da conta
        System.out.print("POR FAVOR, DIGITE O NÚMERO DA SUA CONTA: ");
        int numero_conta = scanner.nextInt();

        // Entrada do número da agência
        System.out.print("POR FAVOR, DIGITE O NÚMERO DA SUA AGÊNCIA: ");
        String numero_agencia = scanner.next();

        // Entrada do nome do cliente
        System.out.print("POR FAVOR, DIGITE O SEU NOME: ");
        String nome_cliente = scanner.next();

        // Entrada do saldo da conta
        System.out.print("POR FAVOR, DIGITE O VALOR DO SALDO DA SUA CONTA: ");
        String saldo = scanner.next();

        // Impressão da mensagem de confirmação
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.%n",
                nome_cliente, numero_agencia, numero_conta, saldo);
    }
}
