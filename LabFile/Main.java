import java.util.Scanner;
class Main{
    public static void main (String args[])
    {
        System.out.println("Arithmetic operation between two numbers ");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number :");
    int a = sc.nextInt();
    System.out.println("Enter the second number :");
    int b= sc.nextInt();
    System.out.println("Enter any arithmetic operation :");
    char abc = sc.next().charAt(0);
    System.out.println(abc);
    switch(abc){
        case '+':
        System.out.print("a + b = ");
        System.out.print(a+b);
        break;

        case '-':
        System.out.print("a - b = ");
        System.out.print(a-b);
        break;

        case '*':
        System.out.print("a * b = "+ a*b);
        break;

        case '/':
        System.out.print("a / b = " + a/b);
        break;

        case '%':
        System.out.print("a % b = "+ a%b);
        break;

        default:
        System.out.print("Not an arithmetic operator");
    }
    
    }

}