import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (checkPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String word) {
        // Convert the word to lowercase to ignore case sensitivity
        word = word.toLowerCase();

        // Remove all non-alphabetic characters
        StringBuilder filteredWord = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                filteredWord.append(ch);
            }
        }

        // Convert the filtered word to a character array
        char[] charArray = filteredWord.toString().toCharArray();

        // Create a character array to store the reversed word
        char[] reversedArray = new char[charArray.length];

        // Fill the reversedArray in reverse order
        for (int i = charArray.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = charArray[i];
        }

        // Check if the original word and the reversed word are equal
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }
}
