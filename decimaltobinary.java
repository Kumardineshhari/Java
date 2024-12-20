import java.util.Scanner;
public class decimaltobinary
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the Decimal no: ");
        int a = sc.nextInt();
        int decimal = a;
        int sum = 0;
        for(int i=decimal,x=1;i>0;sum+=i%2*x,i/=2,x*=10)
        {}
        System.out.println("Input: "+decimal);
        System.out.println("Output: "+sum);
    }

}

/*
Enter the Decimal no: 13
Input: 13
Output: 1101

*/