class Figure{
   
    void area(){
        System.out.println("Area of Figures using Dynamic Method Dispatch ");
    }
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

class Main5
{
    public static void main(String args[]){
        Figure ob1 = new Figure();
        Rectangle ob2 = new Rectangle(2,4);
        Triangle ob3 = new Triangle(4,7);
     
     ob1.area();
     ob2.area();
     ob3.area();
       
    }
}