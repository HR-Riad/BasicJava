import java.util.Scanner;

/**
 *
 * @author HR Riad
 */
public class BookStore {
    static Scanner myScanner =new Scanner (System.in);
   
    static String[] books = {"Java","C","Python"};
   static final double teacherDiscount = 0.3;
    static final double studentDiscount = 0.5;
   static final double alumniDiscount = 0;
  
    
       public static void main (String[]args){
       
     prln ("--- Welcome to Our BOOKSTORE---");
     prln ("Which book do you want?\n Ans:");
     
       //scanner
     String userChoice = myScanner.nextLine();
     
      //choose book 
      
     if (books[0].toLowerCase().equals(userChoice.toLowerCase())) //for any name , like java, JaVa,Java
     {
         prln ("You opted for"+books[0]+"Book.");
         calculatePrice (books[0]);
     }
     else  if (books[1].toLowerCase().equals(userChoice.toLowerCase()))
     {
              prln ("You opted for"+books[1]+"Book.");
                calculatePrice (books[1]);
     }
       else  if (books[2].toLowerCase().equals(userChoice.toLowerCase()))
     {
              prln ("You opted for"+books[2]+"Book.");
                calculatePrice (books[2]);
     }
       else 
     {
         prln ("Sorry we don't have that book you choosed");     }
       }
       
 // create method for show how much price is!
       
       
       static void calculatePrice (String bookName){
           prln ("Are u Teacher,Student,Alumni?\n Ans:");
           String  ans = myScanner.nextLine();
           
           
           // every book price is 300
           double price = 300;
         
           
           // for calculate discount
       if (ans.toLowerCase().equals("teacher"))
       {
           price = price - (price* teacherDiscount);
           showPrice(price);// call method
       }
       
      else if (ans.toLowerCase().equals("student"))
       {
            price = price - (price* studentDiscount);
              showPrice(price);
       }
        else if (ans.toLowerCase().equals("alumni"))
       {
            price = price - (price*  alumniDiscount);
              showPrice(price);
       }
       else
        {
            prln (" Sorry! We can not serve you");
        }
       
       }
       
       static void showPrice (double priceShow ){
           prln ("Your total Payable amount is :" +priceShow);
           prln ("\n ***** Thanks for shopping****");
       }
    static void prln (Object anyObject)
    {
        System.out.println(anyObject);
    }
    
     static void pr (Object anyObject)
     {
        System.out.println(anyObject);
    }

    
}
