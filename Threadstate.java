import java.lang.*;
public class Threadstate implements Runnable{
    public void run()
    {
        Thread.State state = Thread.currentThread().getState();
        System.out.println(Thread.currentThread().getName());
        System.out.println("State = "+state);
    }
    public static void main(String args[])
    {
        Thread t = new Thread(new Threadstate());
        t.start();
    }
}