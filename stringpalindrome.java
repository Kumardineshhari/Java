import java.util.Scanner;

public class stringpalindrome {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("enter the value: ");
        String s = sc.nextLine();
        
        boolean res = isPalindrome(s);

        if (res) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }
    }


    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

       
        return s.equals(rev);
    }
}

/*  
enter the value: malayalam
"malayalam" is a palindrome.

*/