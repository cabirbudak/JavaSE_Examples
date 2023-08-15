package HashMap02;

import java.util.HashMap;

public class LetterCount_example {
    public static void main(String[] args) {
        String input = "Hello, world! How are you?";
        HashMap<Character, Integer> letterCounts = countNonSpaceCharacters(input);

        for (char c : letterCounts.keySet()) {
            int count = letterCounts.get(c);
            System.out.println("Character: " + c + " - Count: " + count);
        }
    }

    public static HashMap<Character, Integer> countNonSpaceCharacters(String input) {
        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ') {
                letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
            }
        }

        return letterCounts;
    }
}

