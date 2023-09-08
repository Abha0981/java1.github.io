import java.util.Scanner;

class Bank_super {
    public int amount = 2000;
}

public class Bank extends Bank_super {
    public int transaction() {

       return amount;
}
    public void withdraw() {

        Scanner i = new Scanner(System.in);
        System.out.println("Enter amount to be Withdrawn");
        int withdraw = i.nextInt();
        amount=amount-withdraw;
       System.out.println("Remaining Amount = "+amount); 
    

    }

    public static void main(String args[]) {
        Bank ob = new Bank();
      
      
                    
                    ob.withdraw();
try{
   int a=ob.transaction();
if(a<1000)
{
throw new ArrayIndexOutOfBoundsException("Transaction failed");
            } else {
                System.out.println("Transaction succesfull,thank you!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
