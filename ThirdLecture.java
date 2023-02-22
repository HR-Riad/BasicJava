import java.util.Scanner;
/**
 *
 * @author HR Riad
 */
public class ThirdLecture {
    static Scanner myScanner =new Scanner (System.in);
    public static void main (String[]args){
        String myName;
        pr ("Plz write your full name");
        myName = myScanner.nextLine(); // = new String("Md Hasanur Rahman Riad");
        System.out.println("This is our previous method");
        System.out.println(myName);
prln("This is our new method:)");
        prln(myName);
        prln ("\n\n The num of character is my name is:"+myName.length());
        
        /* Array 
        1 2 3 4 5 6 7 8 int[] nameofArray = new  int [8];
        */
         /* 2d Array
        
           1 2 4 5
           2 4 5 9
        
        */
        
         int [] [] twoDArray = new int [2][4];
         twoDArray [0][0]=1;
         twoDArray [0][1]=2;
         twoDArray [0][2]=4;
         twoDArray [0][3]=5;
         
          twoDArray [1][0]=2;
          twoDArray [1][1]=4;
          twoDArray [1][2]=5;
          twoDArray [1][3]=9;
   
          /*Replace  twoDArray [1][2]=5;  with the sum of  twoDArray [0][2]=4;
         twoDArray [0][3]=5; */
          
          
          
           twoDArray [1][2] += (twoDArray [0][2] + twoDArray[0][3]);
           prln("At 2d array replace the value of [1][2]:"+twoDArray[1][2]);
         
                 
       if (myName.length()>15) {
           prln("Your name is too long ");
               }
       else if (myName.length()<3) {
           prln("Your name is too short!");
       }
       else {
           
           
//           if(myName.length()==7) {
//           prln("Your lucky to have this name:)");
//           }
//           else {
//                    prln("Your name is okay!");
//                   }
//         


                        //Switch Case//
                        
        switch (myName.length()){
            case 7:
                prln("Your are lucky to have this name:)");
                break;
                
                 case 8:
                prln("You have a 8 char name:)");
                break;
                
                 case 10:
                prln("You have a 10 char name:)");
                break;
                
                 case 13:
                prln("You have 13 char name:)");
                break;
                 default : 
                     prln("You name is okay");
                     break;
        }
      
       }
       /** Increment decrement */
       
         int a = 12;
         int b = 17;
         //post
        b = a++;
        prln("B: " +b);
        
       b = a;
       prln ("B="+b);
       
       //pre
       
       a = ++b;
       prln("A:"+a);
       
       a = b;
       prln ("A="+a);
       
       a = --b;
       prln ("--A="+a);
       
         a = b--;
       prln ("A--="+a);
    }
    
    
    
    
    static void prln (Object anyObject){
        System.out.println(anyObject);
    }
    
     static void pr (Object anyObject){
        System.out.println(anyObject);
    }
}
