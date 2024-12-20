import java.util.Scanner;

public class neon{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value: ");
        int num = sc.nextInt();

        int square = num*num;
        int lastdigit = 0;
        int sum = 0;

        while(square>0){
            lastdigit=square%10;
            sum=sum+lastdigit;
            square=square/10;
        }
        if(num==sum)
            System.out.println("neon number");
        else
            System.out.println("not a neon number");
    }
}

/*  
enter the value: 9
neon number

*/ 
