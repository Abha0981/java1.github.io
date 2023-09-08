import java.util.Scanner;

public class Area_circle 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle = ");
        double r = sc.nextInt();
        double result = r * r * 3.14;
        System.out.print("Area of circle = "+result);
    }
}