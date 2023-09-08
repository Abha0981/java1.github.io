import java.awt.*;

class login_page
{
    login_page()
    {
        Frame f = new Frame();
        Label l1 = new Label("Email id");
        Label l2 = new Label("Password");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button b = new Button("Submit");

        l1.setBounds(100,100,70,20);
        l2.setBounds(100, 150, 70, 20);
        t1.setBounds(170, 100, 100, 20);
        t2.setBounds(200, 150, 100, 20);
        b.setBounds(150, 200,70,20);

    
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.add(t1);
        f.add(t2);

        f.setSize(400,400);
        f.setTitle("Login Page");
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String args[]) 
    {
        login_page obj = new login_page();        
    }
}