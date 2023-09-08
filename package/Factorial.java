package operations;

public class Factorial {
    int num;

    public Factorial(int n) {
        num = n;
    }

    public int Display() {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }
}
