import java.util.Scanner;

public class MultiplicationTable2 {
    //2.Printing Multiplication table using do while loop up to given number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number up to you want to print multiplication table:");
        int number = scanner.nextInt();
        int x = 1;
        int y = 1;
        do {
            do {
                System.out.printf("%-2d * %-2d = %-3d  |  ", y, x, (x * y));
                y++;
            } while (y <= number);
            System.out.println();
            y = 1;
            x++;
        } while (x <= 10);


    }
}
