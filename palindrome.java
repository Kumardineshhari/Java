class palindrome
{
    public static void main(String[] args)
    {
        String name = "madam";
        String rev = new StringBuilder(name).reverse().toString();
        if(name.equals(rev)){
            System.out.println(name+": is palindrome ");
        }
        else
            System.out.println(name+": is not a palindrome");
    }
}

/*
madam: is palindrome 
*/