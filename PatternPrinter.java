package PatternPrinter;
import java.util.Scanner;

public class PatternPrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an interger: ");
        int n = scan.nextInt();

        // loop for the first half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j != i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // loop for the second half of the pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j != i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
