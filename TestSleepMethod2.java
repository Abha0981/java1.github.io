class TestSleepMethod2 extends Thread{
    public void run(){
        for(int i=1; i<5; i++){
            try {Thread.sleep(5000);}catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();

        t1.start();
        t2.run();
    }
}
class TestSleepMethod3 extends Thread{
    public void run(){
        for(int i=5; i<10; i++){
            try {Thread.sleep(5000);}catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestSleepMethod3 t3 = new TestSleepMethod3();
        TestSleepMethod3 t4 = new TestSleepMethod3();

        t3.start();
        t4.run();
    }
}