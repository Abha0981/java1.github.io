class TestMutltiPriority1 extends Thread{
    public void run()
    {
        System.out.println("Name of the Thread "+Thread.currentThread().getName());
        System.out.println("Prority of the Thread "+Thread.currentThread().getPriority());
    }
    public static void main(String args[])
    {
        TestMutltiPriority1 t1 = new TestMutltiPriority1();
        TestMutltiPriority1 t2 = new TestMutltiPriority1();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}