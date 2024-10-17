import java.util.Scanner;

public class Pair {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O LIMITE INFERIOR: ");
        int limiteInferior = scanner.nextInt();
        System.out.print("DIGITE O LIMITE SUPERIOR: ");
        int limiteSuperior = scanner.nextInt();

        for (int i = limiteInferior; i <= limiteSuperior; i++){
            if (i % 2 == 0){
                System.out.printf("%d \n", i);
            }
        }
    }
}
