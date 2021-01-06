package count.vowels;
import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        int x = 0;
        int vowelCount = 0;
        
        String [] letter = new String[word.length()];
        for(int i = 0; i < word.length(); i++){
            //stores value of word at index i in the array; i will keep increasing till word length
            letter[i] = String.valueOf(word.charAt(i));
            if(letter[i].equals("a") || letter[i].equals("e") || letter[i].equals("i") || letter[i].equals("o") || letter[i].equals("u")){
                System.out.println(letter[i] + " at index " + i);
                vowelCount += 1;
            }
        }
        System.out.println("There were a total of " + vowelCount + " vowel(s) in \"" + word + "\".");
    }
}
