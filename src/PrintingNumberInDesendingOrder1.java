import java.util.Scanner;

public class PrintingNumberInDesendingOrder1 {
    //1.WAP to print 10,9,8,7,6,To 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to decrease to 0:");
        int number = scanner.nextInt();
        do {
            System.out.println(number);
            number--;
        } while (number >= 0);

    }
}
