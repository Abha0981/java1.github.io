import java.sql.Array;

class test1{
    public static void main(String[] args) 
    {
        int array[] = {12,23,34,34,4,34,23,34,1,3} ;
        System.out.print("Array = ");
        System.out.print(array.length); 
    }
}

class test2{
    public static void main(String[] args)
    {
        int aa[] ={1,2,3,4,5,5,7,8,43};
        int sum = 0;
        for(int i= 0; i<aa.length; i++)
        {
            sum = sum + aa[i];
            System.out.println("Sum of the array");
            System.out.println(sum);

        }
    }
}