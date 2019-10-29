import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashSet wordsText = new MyHashSet(1006);
        // Step 1: load our txt file of English words.
        try {
            BufferedReader rd = new BufferedReader(new FileReader("F:\\Users\\horsey\\Downloads\\skool\\untitled1\\src\\words.txt"));

            String currentLine = null;
            while ((currentLine = rd.readLine()) != null) {
                // TODO do something with the words we're reading
                wordsText.add(currentLine);
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
        for (int i = 0; i < sentenceWords.length; i++) {
            if( !wordsText.contains(sentenceWords[i])) {
                System.out.println(sentenceWords[i]);
            }
        }

       /* MyHashSet set = new MyHashSet(10);
        MyHashSetNode node = new MyHashSetNode("Dog");
        set.add("Cow");
        set.add("Cat");
        set.add("Dog");
        System.out.println(set.buckets[node.hashCode() % set.capacity]);
        if(set.contains("Cat"))
            System.out.println("Yes");
        else
            System.out.println("No");*/
    }
}