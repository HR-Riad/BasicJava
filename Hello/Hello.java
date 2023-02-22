
package Hello;

import java.util.Scanner;
/**
 *
 * @author HR Riad
 */
public class Hello {
    //user input
 static Scanner sc = new Scanner(System.in);
public static void main (String[]args){
       
    System.out.println("May I know your Name plz!\n");
//user input
    
    String name = sc.nextLine();
    System.out.println("Hello!"+name);
}
             
}
