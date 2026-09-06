import java.util.Scanner;
class nameandage {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the age");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter college");
        String college=sc.nextLine();
        System.out.println("Hello "+name+" you are "+age+" years old and"+" you study at "+college);
    }
}