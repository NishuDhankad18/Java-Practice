import java.util.Scanner;
class add2num{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter seecond number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("Sum of three numbers is: "+sum);
        sc.close();
    }
}