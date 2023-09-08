package p2;

class OtherPackage{
    OtherPackage(){
        p1.protection p = new p1.protection();
        System.out.println("Other Package constructor");
        System.out.println("n_pub = " + p.n_pub);
    }
}