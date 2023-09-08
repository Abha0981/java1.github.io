class usestatic{
    static int p=2;
    static double q=4;
    static void set(){
        System.out.println("p,q="+p +" "+q);
    }
    static{
       System.out.println("Static Block Executed") ;
       System.out.println("Sum of variables="+(p+q));
       
    }
    public static void main(String args[])
    {
        usestatic.set();
    }
}
