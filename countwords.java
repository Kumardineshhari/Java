import java.util.Scanner;

public class countwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the input
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();

        // Count word frequencies and display the result
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) continue;
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = null; // Mark as counted
                }
            }
            System.out.println(words[i] + " - " + count);
        }

        scanner.close();
    }
}


/*
Enter the input string:
hi how hi are hi you hi
hi - 4
how - 1
are - 1
you - 1

*/