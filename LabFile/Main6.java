abstract class Figure{
   
    abstract void area();
}
class Rectangle extends Figure{
    double l;
    double b;
    
    Rectangle(double p, double q){
        l=p;
        b=q;
    }
        
        void area(){
            System.out.println("Area of the rectangle = "+l*b);
            
        }
    }

class Triangle extends Figure{
    double base;
    double height;
    Triangle(double a, double b){
        base=a;
        height =b;
    }
    
        
        void area(){
            System.out.println("Area of the triangle = "+0.5*base*height);
        
        }
    }

class Main6
{
    public static void main(String args[]){
        
        Rectangle ob2 = new Rectangle(34,3);
        Triangle ob3 = new Triangle(89,1);
     ob2.area();
     ob3.area();
   }
}