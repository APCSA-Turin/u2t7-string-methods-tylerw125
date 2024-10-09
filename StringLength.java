import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        if (word1.length() > word2.length()) {
            System.out.println(word1 + " is longer than " + word2);
        } else if (word1.length() < word2.length()) {
            System.out.println(word2 + " is longer than " + word1);
        } else {
            System.out.println("Both words have the same length.");
        }

        int midIndex1 = word1.length() / 2;
        String firstHalf1 = word1.substring(0, midIndex1);
        String secondHalf1 = word1.substring(midIndex1);

        int midIndex2 = word2.length() / 2;
        String firstHalf2 = word2.substring(0, midIndex2);
        String secondHalf2 = word2.substring(midIndex2);

        System.out.println("First word split into halves: " + firstHalf1 + " and " + secondHalf1);
        System.out.println("Second word split into halves: " + firstHalf2 + " and " + secondHalf2);

        int index = word1.indexOf(word2);
        if (index != -1) {
            System.out.println(word2 + " is found in " + word1 + " at index " + index);
        } else {
            System.out.println(word2 + " is NOT found in " + word1);
        }

        scanner.close();
    }
}


