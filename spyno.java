import java.util.Scanner;
public class spyno
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("enter the number: ");
        int num = sc.nextInt();

        int sum = 0,product=1,lastdigit=0;

        while(num>0){
            lastdigit=num%10;
            sum=sum+lastdigit;
            product=product*lastdigit;
            num=num/10;
        }
        if(sum==product)
            System.out.println("spy number");
        else
            System.out.println("not a spy number");

    }
}

/* 
enter the number: 1412
spy number
*/

