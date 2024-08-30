import java.util.HashMap;
import java.util.Map;

public class FunHash {
    
    public static void wordCount(){

        // input string
        String sentence = "This is an example. Another sentence for the example. and another is good.";

        // Hashmap
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the sentence
        String[] words = sentence.toLowerCase().split("\\W+");

        // Iterate through the words
        for (String word : words) {
            // If the word is already in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // else, add the word with a count of 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void charCount(){
        // input string
        String sentence = "Why is this the example again";

        // Hashmap
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Split the sentence into char
        char[] characters = sentence.toCharArray();

        // Iterate through the chars
        for (char c : characters) {
            // If the char is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // else, add the word with a count of 1
                charCountMap.put(c, 1);
            }
        }

        // Print the char frequencies
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void numCount(){
        // input array
        int[] arr = {1,2,3};

        // Hashmap
        HashMap<Integer, Integer> numCountMap = new HashMap<>();

        // Iterate through the num
        for (int n : arr) {
            // If the num is already in the map, increment its count
            if (numCountMap.containsKey(n)) {
                numCountMap.put(n, numCountMap.get(n) + 1);
            } else {
                // else, add the word with a count of 1
                numCountMap.put(n, 1);
            }
        }

        // Print the num frequencies
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args){
        wordCount();
        charCount();
        numCount();
    }

}
