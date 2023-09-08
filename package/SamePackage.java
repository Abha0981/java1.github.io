package p1;

class SamePackage{
    SamePackage(){
        protection p = new protection();
        System.out.println("same package constructor");
        System.out.println("n = "+ p.n);
        System.out.println("n_pro = "+ p.n_pro);
        System.out.println("n_pub = "+ p.n_pub);
    }
}