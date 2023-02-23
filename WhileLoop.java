

/**
 *
 * @author HR Riad
 */
public class WhileLoop {
   public static void main(String[] args){
       
       int [] numArray = new int [100];
       int i = 100;
       while (i>0)
       {
       numArray [i-1] = (i-1);
       i--;
       }
       
       while (i<100)
       {
           prln ("array ["+i+"]:"+numArray[i]);
           i++;
       }
       
   }
    
    
    
    
     static void prln(Object anyObject) {
        System.out.println(anyObject);
    }
}
