interface animal {
    void a();
}
class dog implements animal{
    public void a()
    {
        System.out.println("Dog is an animal");
    }
    public static void main(String args[]) {
        dog obj = new dog();
        obj.a();
    }
}