package reverse.a.string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        String input = "";
        System.out.println("Enter a word that you want to reverse:");

        do{
        //scanning your input
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        
        //making a hashmap of <index, character> of the string
        HashMap<Integer,Character> index_to_char = new HashMap<>();
        
        //needed to initialize variables before the for loop
        //word_length is 1 smaller than the length of word because index starts at 0 but word.length starts counting at 1
        int word_length = word.length()-1;
        int dup_word_length = word_length;
        
        
        for(int i = -1; i < dup_word_length; i++){
            //putting values into the hasmap
            index_to_char.put(word_length, word.charAt(word_length));
            word_length = word_length - 1;
        }
        
        //had to reinitalize variable because the for loop messed with them
        word_length = word.length()-1;
        
        //copied it from online, wanted to find a way to convert <character> values of hashmap to array
        //had to make a seperate array because if I used hasmap's own values, it'd overwrite themselves
        //... test became tsst because it copied the value of the 2nd key, which I overwrited to be the 3rd value
        Collection<Character> values = index_to_char.values(); 
        ArrayList<Character> listOfValues = new ArrayList<Character>(values);

        //again, initializing first so for loop doesn't mess with them
        int a = 0;
        for(int i = -1; i < dup_word_length; i++){
            //actually reversing the hashmap
            index_to_char.replace(a, listOfValues.get(word_length));
            a = a + 1;
            word_length = word_length -1;
        }
        
        //again, copied from online because it was easier to print arraylist <character> into a string rather than a colelction
        Collection<Character> values1 = index_to_char.values(); 
        ArrayList<Character> listOfValues1 = new ArrayList<Character>(values);
        
        //building the string
        StringBuilder result = new StringBuilder(listOfValues1.size());
        for (Character c : listOfValues1) {
            result.append(c);
        }
        String output = result.toString();
        
        //holy shit it's over
        System.out.println(output + "\nType in another word or type in 0 to exit:");
        }while(!input.equals("0"));
    }
    
}