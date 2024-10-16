import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE SUA MÉDIA: ");
        float nota = input.nextFloat();

        String resultado = nota >= 7 ? "APROVADO": nota >= 4 && nota < 7 ? "PROVA FINAL" : "REPROVADO";

        System.out.printf("RESULTADO: %s",resultado);
    }
}
