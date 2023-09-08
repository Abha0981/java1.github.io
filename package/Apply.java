import operations.*;

class Apply {
    public static void main(String args[]) 
    {
        operations.Sum ob1 = new operations.Sum(2, 3);
        int m = ob1.Display();
        operations.Subtract ob2 = new operations.Subtract(10, 5);
        int n = ob2.Display();
        System.out.println("Sum=" + m);
        System.out.println("Diffrence ="+ n);
        operations.Factorial ob3 = new operations.Factorial(12);
        int factorial = ob3.Display();
        System.out.println("Factorial=" + factorial);

    }
}
