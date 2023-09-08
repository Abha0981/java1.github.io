import java.util. *;

class box

{

public double volume(double x, double y, double z)

{

double vol=x*y*z;

return vol;

}

public void main ()

{

Scanner sc=new Scanner (System.in);

System.out.println ("Enter length, breadth and height") ;

double l=sc.nextDouble();

double b=sc.nextDouble();

double h=sc.nextDouble();

System.out.println ("Volume =" +volume(l, b, h)) ;

}

}