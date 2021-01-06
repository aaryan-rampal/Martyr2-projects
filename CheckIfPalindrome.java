//Oct 18, 2020

package check.pkgif.palindrome;
import java.util.Scanner;

public class CheckIfPalindrome {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("This program checks whether a word is "
                + "a palindrome or not.\nPlease type in a word:");
        String inp = scan.nextLine();
        inp = inp.toLowerCase();
        String revinp = new StringBuilder(inp).reverse().toString();
        
        do{
            if(revinp.equals(inp)){
            
                System.out.println("'" + inp + "' is a palidrome!\n"
                        + "Please type in another word or type 'q' to "
                        + "quit:");
                inp = scan.nextLine();
                inp = inp.toLowerCase();
                revinp = new StringBuilder(inp).reverse().toString();
            
            }else{
            
                System.out.println("'" + inp + "' is not a palindrome.\n"
                        + "Please type in another word or type 'q' to "
                        + "quit:");
                inp = scan.nextLine();
                inp = inp.toLowerCase();
                revinp = new StringBuilder(inp).reverse().toString();
            
            }
            
        }while(!inp.equals("q"));
       
    }
    
}
