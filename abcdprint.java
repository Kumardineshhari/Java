public class abcdprint
{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(i+"- ");
            for(char ch='a';ch<='z';ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

/*
1- a b c d e f g h i j k l m n o p q r s t u v w x y z 
2- a b c d e f g h i j k l m n o p q r s t u v w x y z 
3- a b c d e f g h i j k l m n o p q r s t u v w x y z 
4- a b c d e f g h i j k l m n o p q r s t u v w x y z 
5- a b c d e f g h i j k l m n o p q r s t u v w x y z 
6- a b c d e f g h i j k l m n o p q r s t u v w x y z 
7- a b c d e f g h i j k l m n o p q r s t u v w x y z 
8- a b c d e f g h i j k l m n o p q r s t u v w x y z 
9- a b c d e f g h i j k l m n o p q r s t u v w x y z 
10- a b c d e f g h i j k l m n o p q r s t u v w x y z 

*/