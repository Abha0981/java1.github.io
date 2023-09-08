class TestJoinMethod4 extends Thread{
    public void run()
    {
        System.out.println("running...");
    }
    public static void main(String args[])
    {
        TestJoinMethod4 t1 = new TestJoinMethod4();
        TestJoinMethod4 t2 = new TestJoinMethod4();
        System.out.println("t1 and t2 Name "+t1.getName()+" "+t2.getName());
        System.out.println("t1 and t2 Id "+t1.getId()+" "+t2.getId());
        t1.start();
        t2.start();
        t1.setName("Palak Tomar"); // here it not setting the name because its already starts its execution after execution 
        System.out.println("After changing the name of the t1"+t1.setName());// it do not change the name of the thread 
    }
}

class TestJoinMethod5 extends Thread{
    public void run()
    {
        System.out.println("running...");
    }
    public static void main(String args[])
    {
        TestJoinMethod5 t1 = new TestJoinMethod5();
        TestJoinMethod5 t2 = new TestJoinMethod5();
        System.out.println("t1 and t2 Name = "+t1.getName()+" "+t2.getName());
        System.out.println("t1 and t2 Id = "+t1.getId()+" "+t2.getId());

        t1.setName("Palak Tomar"); 
        System.out.println("After changing the name of the t1 = "+t1.getName());

        t1.start();
        t2.start();
        
    }
}