import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("QUAL FOTORIAL DESEJA DESCOBRIR: ");
        int number = scanner.nextInt();

        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }

        System.out.printf("O FATORIAL É %d",factorial);
    }
}
