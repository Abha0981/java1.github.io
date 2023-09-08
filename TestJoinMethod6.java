class TestJoinMethod6 extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        TestJoinMethod6 t1 = new TestJoinMethod6();
        TestJoinMethod6 t2 = new TestJoinMethod6();
        t1.start();
        t2.start();
    }
}