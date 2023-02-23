
import java.util.Scanner;

/**
 *
 * @author HR Riad
 */
public class Compare {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        prln("Enter num for a:");
        a = myScanner.nextInt();
        prln("Enter num for b:");
        b = myScanner.nextInt();

      prln (a<b? "A is less than B": "B is less than A");
      prln(compare (a,b));

    }
static String compare (int a, int b) {
    if (a<b)
    {
        return "A is less than B";
    }
    else 
    {
         return "B is less than A";
    }
    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }
}