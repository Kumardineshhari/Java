import java.util.Scanner;
public class binarytodecimal
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the binary no: ");
        int binary = sc.nextInt();
        int sum = 0;
        for(int i=binary,x=1;i>0;sum+=i%10*x,i/=10,x*=2)
        {}
        System.out.println("Input: "+binary);
        System.out.println("Output: "+sum);

    }
}

/*
Enter the Binary no: 1101
Input: 1101
Output: 13

 */