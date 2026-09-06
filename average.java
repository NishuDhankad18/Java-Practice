import java.util.Scanner;
class average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double average=(a+b+c)/3.0;
        System.out.println("Average of three numbers is: "+average);
            sc.close();

    }
}