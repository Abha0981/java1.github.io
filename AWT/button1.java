import java.awt.*;
public class button1 extends Frame
{
    button1()
    {
        Button b = new Button("Click me 😊");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("Click the Button");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]) 
    {
        button1 s = new button1();   
    }
}
