class table {
    void printTable(int n)
    {
        for(int i=1;i<=5;i++)
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

}
    class Mythread1 extends Thread{
        table t;
        Mythread1(table t){
            this.t=t;
        }
        public void run()
        {
            t.printTable(2);
        }
    }
    class Mythread2 extends Thread{
        table t;
        Mythread2(table t){
            this.t=t;
        }
        public void run()
        {
            t.printTable(3);
        }
    }
    class Mythread3 extends Thread{
        table t;
        Mythread3(table t){
            this.t=t;
        }
        public void run()
        {
            t.printTable(4);
        }
    }
    class TestSynchronization
    {
        public static void main(String args[])
        {   
            table obj = new table();
            Mythread1 t1= new Mythread1(obj);
            Mythread2 t2= new Mythread2(obj);
            Mythread3 t3= new Mythread3(obj);
            t1.start();
            t2.start();
            t3.start();
        }
    }
