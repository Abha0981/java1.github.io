public class SLMain 
{
 public static void main(String[] args) 
 {
 int arr[] = new int[]{1,2,3,4,5,6,7,8};
 int smallest = arr[0];
 int largest = arr[0];
 
 for(int i=1; i< arr.length; i++)
 {
 if(arr[i] > largest)
 largest = arr[i];
 else if (arr[i] < smallest)
 smallest = arr[i];
 
 }
 System.out.println("Smallest Number is : " + smallest);
 System.out.println("Largest Number is : " + largest);
 int diff = largest-smallest;
 System.out.println("Diffrence between Largest and Smallest Number is : " +diff );  
 }
}