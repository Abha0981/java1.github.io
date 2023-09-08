import java.awt.*;
public class list extends Frame{
    list()
    {
        Button b = new Button("Submit :)");
        Label l = new Label("Enter Your Exam Name");
        TextField d = new TextField();
        List t = new List(4);
        b.setBounds(30,100,80,30);
        l.setBounds(40,150,150,30);
        d.setBounds(50,100,200,30);  
        t.setBounds(70,90,80,80);
        add(b);
        add(l);
        add(d);
        t.add("UPSC");
        t.add("JEE");
        t.add("NEET");
        setTitle("Code for Button, Label, TesxtField, List");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]) 
    {
        list n = new list();   
    }
}