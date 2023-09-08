import java.util.Scanner;

public class Userdefexc {
    public static void Resister() {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter your cgpa ");
        float cgpa = i.nextFloat();

        if (cgpa < 5) {
            throw new ArithmeticException("Not applicable candidate");
        } else {
            System.out.println("Welcome!");
        }

    }

    public static void main(String args[]) {
        Resister();
    }

}