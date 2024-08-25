import java.util.Scanner;

class vowelConsonent
{
     public static void main(String[] args)
		 {

               Scanner sc = new Scanner(System.in);

               System.out.print("Enter a name: ");
               char ch = sc.next().charAt(0);
            // ((cnd)?(true op1): (false op2));

               System.out.println((ch=='a'|| ch=='e'||ch=='o'||ch=='u'||ch=='i')?
                                  (ch+" it is a vowel"): (ch+" it is a consonent"));
		 }
}