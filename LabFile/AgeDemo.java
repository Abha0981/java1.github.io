import java.util.Scanner;
class AgeException extends Exception 
{

    public AgeException(String str) 
    {
        System.out.println(str);
    }
}
class AgeDemo 
{

    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ur age :: ");
        int age = s.nextInt();

        try {
            if(age < 18)
                throw new AgeException("You are not eligible");
            else
                System.out.println("You can Vote");
        }
        catch (AgeException a) {
            System.out.println(a);
        }
    }
}