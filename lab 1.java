import java.text.BreakIterator;
import java.util.Scanner;

class lab1{         // Ques 1
    public static void main(String agrs[]){
        System.out.println("Enter HELLO");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Enter Your name");
        String name = sc.nextLine();
        System.out.print(a);
        System.out.print(" " +name);
        

    }
    
}

class add{          // Ques 2
    public static void main(String args[]) {
        System.out.println("We are printing sum of two numbers ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        int c= a+b;
        System.out.println("a + b = "+c);
    }
}

class simpleinterest{       //Ques 3
    public static void main(String args[]) {
        double p,r,t,si;
        System.out.println("We are printing simple interest ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle = ");
        p= sc.nextDouble();
        System.out.print("Enter rate = ");
        r=sc.nextDouble();
        System.out.print("Enter time(in year) = ");
        t=sc.nextDouble();
        si=(p*r*t)/100;
        System.out.println("simple interest = "+ si);
            
    }
}

class prime{            //Ques 4 1st part
    public static void main(String args[]) {
        int pr,i=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number = ");
        pr = sc.nextInt();
        if(pr==0||pr==1){
            System.out.print("It is not a prime number ");
        }
        if(pr==i){
            System.out.print("It is a prime number ");
            
        }
        if(pr%i==0){
            if(pr==2){
                System.out.print("It is a prime number ");
            }
            else{
                System.out.print("It is not a prime number ");
            }    
            
        }
        


        
    }
}