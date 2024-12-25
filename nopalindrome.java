import java.util.Scanner;

class nopalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value: ");
        int num = sc.nextInt();

        boolean res = ispalindrome(num);

        if(res){
            System.out.println("\""+num+"\""+" is palindrome");
        }
        else
             System.out.println("\""+num+"\""+" is not a  palindrome");
    }

    public static boolean ispalindrome(int n)
    {
        int temp = n;
        int rev=0,sum=0;

        while(n>0)
        {
            rev=n%10;
            sum=(sum*10)+rev;
            n=n/10;
        }

        return temp==sum;
    }
}

/*
enter the value: 101
"101" is palindrome


 */