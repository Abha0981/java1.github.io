public class Box1
{
        private double width;
        private double height;
        private double depth;
        Box1(double w, double h, double d)
        {
            width = w;
            height = h;
            depth = d;
        }
        Box1()
        {
            width = -1; // use -1 to indicate
            height = -1; // an uninitialized
            depth = -1; // box
        }
        double volume()
        {
            return width * height * depth;
        }
    }
    class BoxWeight1 extends Box1
    {
        double weight;
        BoxWeight1(double w, double h, double d, double m)
        {
            super(w, h, d);
            weight = m;
        }
        BoxWeight1()
        {
            super();
            weight = -1;
        }

    }
    class DemoSuper
    {
        public static void main(String args[]) {
            BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
            BoxWeight1 mybox2 = new BoxWeight1();

            double vol;
            vol = mybox1.volume();
            System.out.println("Volume of mybox1 is " + vol);
            System.out.println("Weight of mybox1 is " + mybox1.weight);
            System.out.println();

            vol = mybox2.volume();
            System.out.println("Volume of mybox2 is " + vol);
            System.out.println("Weight of mybox2 is " + mybox2.weight);
            System.out.println();

        }
    }