import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Div extends Applet implements ActionListener
{
String msg;
TextField num1,num2,res;Label l1,l2,l3;
Button div;
public void init()
{
l1=new Label("Number 1");
l2=new Label("Number 2");
l3=new Label("result");
num1=new TextField(10);
num2=new TextField(10);
res=new TextField(10);
div=new Button("DIV");
div.addActionListener(this);
add(l1);
add(num1);
add(l2);
add(num2);
add(l3);
add(res);
add(div);
}
public void actionPerformed(ActionEvent ae)
{
String arg=ae.getActionCommand();
if(arg.equals("DIV"))
{
String s1=num1.getText();
String s2=num2.getText();
int num1=Integer.parseInt(s1);
int num2=Integer.parseInt(s2);
if(num2==0)
{
try
{
System.out.println(" ");
}
catch(Exception e)
{
System.out.println("ArithematicException"+e);
}
msg="Arithemetic";
repaint();
}
else if((num1<0)||(num2<0))
{
try
{
System.out.println("");
}
catch(Exception e)
{
System.out.println("NumberFormat"+e);
}
msg="NumberFormat";
repaint();
}
else
{
int num3=num1/num2;
res.setText(String.valueOf(num3));
}
}
}
public void paint(Graphics g)
{
g.drawString(msg,30,70);
}
}