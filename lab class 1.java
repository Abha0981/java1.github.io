import java.util.*;
import java.util.Scanner;

class opr{
    public void f1(int a, int b){
        System.out.println("showing : (a+b)^2 = a^2 + b^2 + 2ab ");
        System.out.println("(a+b)^2" + (a*a +b*b + 2*a*b));
    }
    public void f2(int a, int b){
        System.out.println("showing : (a+b)(a-b)= a^2 -b^2 ");
        System.out.println("(a+b)(a-b)" + (a*a - b*b ));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();

        opr f1 = new main();
        f1.f1(a, b);
        f1.f2(a, b);
    }
}