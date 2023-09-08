class Q11{
    void printTable(int n)
    {
        for(int i=1;i<=6;i++)
        {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }


    class MyThread1 extends Thread{
        Q11 t;
        MyThread1(Q11 t){
            this.t=t;
        }
        public void run()
        {
            t.printTable(2);
        }
    }
    class MyThread2 extends Thread{
        Q11 t;
        MyThread2(Q11 t){
            this.t=t;
        }
        public void run()
        {
            t.printTable(3);
        }
    }
    class MyThread2 extends Thread{
        Q11 t;
        MyThread2(Q11 t){
            this.t=t;
        }
        public void run()
        {
            t.printTable(4);
        }
    }
    class TestSynchronization1
    {
        public static void main(String args[])
        {   
            Q11 obj = new Q11();
            MyThread1 t1=new MyThread1(obj);
            MyThread2 t2=new MyThread2(obj);
            t1.start();
            t2.start();
        }
    }
}