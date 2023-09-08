class X extends Thread
{
    public void run()
    {
        System.out.println("Thread X Started");
        for(int i=0; i<5; i++)
        {
            System.out.println("value of i in Thread x: "+i);
        }
        System.out.println("Thread X finished");
    }
}
class Y extends Thread
{
    public void run()
    {
        System.out.println("Thread Y started");
        for(int i=0; i<5; i++)
        {
            System.out.println("Value of i in Thread Y: "+i);
        }
        System.out.println("Thread Y finished");
    }
}
class Z extends Thread{
    public void run()
    {
        System.out.println("Thread Z started");
        for(int i=0; i<5; i++)
        {
            System.out.println("Value of i in Thread Z :"+i);
        }
        System.out.println("Thread Z finished");
    }
}
class ThreadPriority
{
    public static void main(String[] args)
    {
        System.out.println("main Thread Started");
        X x1 = new X();
        Y y1 = new Y();
        Z z1 = new Z();
        z1.setPriority(Thread.MAX_PRIORITY);
        y1.setPriority(x1.getPriority()+1);
        x1.setPriority(Thread.MIN_PRIORITY);
        x1.start(); y1.start(); z1.start();

        try {
            x1.join();y1.join();z1.join();
        } catch (InterruptedException e) {}
        System.out.println("Main Thread Finished");
    }
}