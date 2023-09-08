import java.awt.*;
public class awt extends Frame{
    awt()
    {
        Button b = new Button("Submit :)");
        Label l = new Label("Enter Your Exam Name");
        TextField d = new TextField();
        b.setBounds(30,100,80,30);
        l.setBounds(40,150,150,30);
        d.setBounds(50,100,200,30);
        add(b);
        add(l);
        add(d);
        setTitle("Code for Button, Label, TesxtField");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]) 
    {
        awt n = new awt();   
    }
}