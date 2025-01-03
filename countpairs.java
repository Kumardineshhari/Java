import java.util.Scanner;

public class countpairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the first input
        System.out.println("Enter the first input string:");
        String input1 = scanner.nextLine();

        // Prompt for the second input
        System.out.println("Enter the second input string:");
        String input2 = scanner.nextLine();

        // Display the results
        System.out.println(countAndFormat(input1));
        System.out.println(countAndFormat(input2));

        scanner.close();
    }

    // Method to count occurrences of "()" and format the output
    public static String countAndFormat(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == '(' && input.charAt(i + 1) == ')') {
                count++;
            }
        }
        return "()-" + count;
    }
}


/*
Enter the first input string:
(() () ()
Enter the second input string:
(()) ((())
()-3
()-2

*/