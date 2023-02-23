
import java.util.Scanner;

/**
 *
 * @author HR Riad
 */
public class IntMethod {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        prln("Enter num for a:");
        a = myScanner.nextInt();
        prln("Enter num for b:");
        b = myScanner.nextInt();

        prln(calculateNumber(a, b));

    }

    static int calculateNumber(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }
}