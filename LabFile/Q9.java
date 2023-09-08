import java.util.Arrays;
class Q9{
    public static void main(String args[]) 
    {
        int[] arr = {34,56,23,45,2,1};
        Arrays.sort(arr);
        System.out.println("Arrays in ascending order : "+Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) 
        {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("Arrays in decending order : "+Arrays.toString(arr));   
    }
}