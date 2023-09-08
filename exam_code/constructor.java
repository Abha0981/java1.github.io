public class constructor {
    int id;
    String name;
    constructor(int i, String b)
    {
        id = i;
        name = b;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[]) {
        constructor obj = new constructor(23, "Abha");
        obj.display();
    }
}
