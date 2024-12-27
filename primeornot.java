import java.util.Scanner;

public class primeornot
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value: ");
        int num = sc.nextInt();

        if(num==0 || num==1)
        {
            System.out.println("neither prime nor composite");
        }
        else
        {
            boolean res = true;
            for(int i=2;i<num;i++)
            {
                if(num%2==0)
                {
                    res = false;
                    break;
                }
            }
            String ans=(res)?"prime":"not prime";
            System.out.println(ans);
        }
    }
}