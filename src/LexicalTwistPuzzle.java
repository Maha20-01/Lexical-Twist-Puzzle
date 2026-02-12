import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Display puzzle title
        System.out.println("Lexical Twist Puzzle");

        // Read first word
        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        // Read second word
        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        // Validate that inputs are single words (no spaces)
        if (word1.contains(" ") || word2.contains(" ")) {
            System.out.println("Invalid word input. Only single words allowed.");
            return; // stop execution
        }

        // Reverse the first word
        String reversed = new StringBuilder(word1).reverse().toString();

        // Case 1: If second word is reverse of first word
        if (reversed.equalsIgnoreCase(word2)) {

            // Convert reversed word to lowercase
            String lower = reversed.toLowerCase();

            // StringBuilder used for better performance
            StringBuilder result = new StringBuilder();

            // Replace vowels with '@'
            for (char ch : lower.toCharArray()) {
                if ("aeiou".indexOf(ch) != -1) {
                    result.append("@");
                } else {
                    result.append(ch);
                }
            }

            // Display transformed word
            System.out.println("Transformed word: " + result);

        }
        // Case 2: Words are NOT reverse of each other
        else {

            // Combine both words and convert to uppercase
            String combined = (word1 + word2).toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            // Count vowels and consonants
            for (char ch : combined.toCharArray()) {

                if ("AEIOU".indexOf(ch) != -1) {
                    vowelCount++;
                }
                else if (Character.isLetter(ch)) {
                    consonantCount++;
                }
            }

            // Display counts
            System.out.println("Vowels: " + vowelCount);
            System.out.println("Consonants: " + consonantCount);
        }

        // Display entered words
        System.out.println("You entered: " + word1 + " and " + word2);

        // Close scanner
        sc.close();
    }
}
