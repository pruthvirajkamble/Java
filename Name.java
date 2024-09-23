import java.util.Scanner;
class Name
{   
    static Scanner sc = new Scanner(System.in);
    static int i = 0;
    static String str = sc.next();
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        printName();

        // for (int i=0;i<str.length();i++) 
        // {
        //     System.out.println(str.charAt(i));
        // }    
    }
    public static void printName()
    {
        int n = str.length();
        if(n>0){
            System.out.println(str.charAt());
            return;
        }
        printName();

    }
}