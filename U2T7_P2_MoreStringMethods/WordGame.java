import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String previousWord = "";

        while (score < 50) {
            System.out.println("Enter a word: ");
            String currentWord = scanner.nextLine();

            if (!previousWord.isEmpty()) {
                if (currentWord.equals(previousWord)) {
                    score -= 10; // same word
                } else if (currentWord.compareTo(previousWord) > 0) {
                    score += 2; // current > previous
                } else {
                    score -= 5; // current < previous
                }

                // Check for length match
                if (currentWord.length() == previousWord.length()) {
                    score += 4; // same length
                }

                // last two letters match first two letters
                if (previousWord.length() >= 2 && currentWord.length() >= 2 &&
                    previousWord.substring(previousWord.length() - 2).equals(currentWord.substring(0, 2))) {
                    score += 5;
                }

                // first letter of previous word in current word
                if (currentWord.indexOf(previousWord.charAt(0)) != -1) {
                    score += 3;
                }
            }

            previousWord = currentWord; // Update previous word
            System.out.println("Current score: " + score);
        }
        
        System.out.println("Congratulations! Your final score is: " + score);
        scanner.close();
    }
}

