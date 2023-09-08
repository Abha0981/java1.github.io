class TestPriority1 extends Thread{
    public void run()
    {
        System.out.println("Name of the Thread "+Thread.currentThread().getName());
        System.out.println("Prority of the Thread "+Thread.currentThread().getPriority());
    }
    public static void main(String args[])
    {
        TestPriority1 t1 = new TestPriority1();
        TestPriority1 t2 = new TestPriority1();
        TestPriority1 t3 = new TestPriority1();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(t1.getPriority()+4);
        t1.start();
        t2.start();
        t3.start();
    }
}