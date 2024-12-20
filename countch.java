import java.util.Scanner;

public class countch{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value: ");
        String name = sc.nextLine();

        char ch[] = name.toCharArray();
        String ans = " ";

        for(int i=0;i<ch.length;i++)
        {
            int count = 1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                    ch[j]=' ';

                }
            }
            if(ch[i]!=' ')
                ans+=ch[i]+"-"+count+" ";
        }
        System.out.println("Given Value: "+name);
        System.out.println("Result: "+ans);
    }
}

/*

enter the value: hello earth
Given Value: hello earth
Result:  h-2 e-2 l-2 o-1 a-1 r-1 t-1

 */