import java.util.Scanner;

/**
 * <h2>Classe App</h2>
 * <p>Classe principal que executa o programa, permitindo ao usuário inserir dados pessoais e validar informações.</p>
 */
public class Main {
    /**
     * <h2>Método main</h2>
     * <p>Ponto de entrada do programa. Aqui, o usuário é solicitado a inserir seus dados e as informações são validadas.</p>
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializa o scanner para entrada de dados.
        Utils utils = new Utils(); // Cria uma instância da classe Utils para usar seus métodos.

        // Entrada do nome do usuário.
        System.out.print("DIGITE O SEU NOME: ");
        String nome_usario = scanner.nextLine();

        // Entrada do gênero do usuário.
        System.out.print("DIGITE O SEU GÊNERO (M/F): ");
        String genero = scanner.nextLine();
        genero = utils.verificandoGenero(genero); // Valida o gênero usando o método da classe Utils.

        // Entrada da idade do usuário.
        System.out.print("DIGITE SUA IDADE: ");
        int idade = scanner.nextInt();
        idade = utils.verificandoIdade(idade); // Valida a idade usando o método da classe Utils.

        // Entrada do CPF do usuário.
        System.out.print("DIGITE SEU CPF: ");
        long cpf = scanner.nextLong();
        cpf = utils.verificandoCpf(cpf); // Valida o CPF usando o método da classe Utils.

        // Solicita ao usuário para pressionar ENTER para continuar.
        utils.enter();
        utils.clear(); // Limpa a tela.

        // Entrada da senha do usuário.
        System.out.print("DIGITE SUA SENHA (4 DÍGITOS): ");
        int senha = scanner.nextInt();
        utils.clear(); // Limpa a tela.

        // Solicita ao usuário para pressionar ENTER para continuar.
        utils.enter();
        utils.clear(); // Limpa a tela.

        // Entrada da confirmação da senha do usuário.
        System.out.print("CONFIRME SUA SENHA: ");
        int confirmando_senha = scanner.nextInt();
        confirmando_senha = utils.verificandoSenha(senha, confirmando_senha); // Valida a confirmação da senha.

        utils.clear(); // Limpa a tela após a validação da senha.
        utils.clear(); // Limpa a tela novamente (pode ser redundante, mas mantém a consistência).

        // Solicita ao usuário para pressionar ENTER para continuar.
        utils.enter();
        utils.clear(); // Limpa a tela antes de exibir os dados.

        // Exibe o status do cadastro do usuário.
        System.out.println(" ----- STATUS -----");
        System.out.println("- NOME: " + nome_usario);
        System.out.println("- GÊNERO: " + genero);
        System.out.println("- IDADE: " + idade);
        System.out.println("- CPF: " + cpf);
        System.out.println("- SENHA: " + confirmando_senha);
        System.out.println(" PROCESSO DE CADASTROS CONCLUÍDO!!!"); // Mensagem final de conclusão do processo de cadastro.
    }
}
