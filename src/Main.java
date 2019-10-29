import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        // Step 1: load our txt file of English words.
        try {
            BufferedReader rd = new BufferedReader(new FileReader("words.txt"));

            String currentLine = null;
            while ((currentLine = rd.readLine()) != null) {
                // TODO do something with the words we're reading
            }
        } catch (IOException e) {
            System.out.println("Exception loading words.txt.");
        }

        // Step 2: read the sentence given into an array of strings
        String[] sentenceWords;
        String input = sc.nextLine();
        if (input.equals("")) {
            sentenceWords = new String[0];
        } else {
            sentenceWords = input.split(" ");
        }

        // Step 3: print all misspelled words
        // TODO implement this using your own version of a HashSet.*/

        MyHashSet set = new MyHashSet(10);
        set.add("Cow");
        set.add("Cat");
        set.add("Dog");
        System.out.print(set.buckets[8]);
        if(set.contains("Ct"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}