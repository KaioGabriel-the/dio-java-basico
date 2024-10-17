import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE ATÉ QUE NÚMERO DESEJA IR: ");
        int number = scanner.nextInt();

        for (int i= 0; i<=number; i++){
            System.out.printf("%d \n",i);
        }
    }
}