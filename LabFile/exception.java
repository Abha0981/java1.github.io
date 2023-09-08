public class exception {
    public static void main(String args[]) {

        try {
            int a[] = { 0, 1, 2, 3, 4 };
            int data = a[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't access the provided index");
            System.out.println("Standard message:");
            System.out.println(e);
}
finally
{
 System.out.println("execute !!!");
}
}
}
