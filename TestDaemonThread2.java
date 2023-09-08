class TestDaemonThread2 extends Thread
{
    public void run()
    {
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("Daemon: "+Thread.currentThread().isDaemon());
    }
    public static void main(String[] args){
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();
        
        t1.start();
        t1.setDaemon(true); //we can't set daemon thread after the start method 
        t2.start();         // because it already in execution
        
    }
}