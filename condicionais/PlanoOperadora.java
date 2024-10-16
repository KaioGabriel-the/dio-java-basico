import java.util.Scanner;

public class PlanoOperadora {

    public static void main(String[] args){
        //Instanciando o objeto scanner no código;
        Scanner input = new Scanner(System.in);

        //Entrada;
        System.out.print(" --- PLANOS DA OPERADORA SÃO --- \n*BASIC(B) --> 100 MINUTOS DE LIGAÇÕES \n*MIDIA(M) --> 100 MINUTOS DE LIGAÇÕES E WHATS E INSTAGRAM GRÁTIS \n*TURBO(T) --> 100 MINUTOS DE LIGAÇÕES, WHATS E INSTAGRAM GRÁTIS E 5G DE YOUTUBE");
        System.out.println("\nQUAL PLANO DESEJA ASSINAR: ");
        String plano = input.next();

        //Processamento;
        switch (plano){
            case "T": {
                System.out.println("5G DE YOUTUBE");
            }
            case "M":{
                System.out.println("WHATS E INSTAGRAM GRÁTIS");
            }
            case "B": {
                System.out.println("100 MINUTOS DE LIGAÇÕES");
                break;
            }
            default:{
                System.out.println("VOCÊ DIGITOU ERRADO");
            }
        }
    }
}
