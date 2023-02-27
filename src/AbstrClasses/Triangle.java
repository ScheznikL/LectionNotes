package AbstrClasses;

public class Triangle extends Figure {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
        // super.pi = 3.14 - для перевизначення ? пересм
    }

    @Override
    double Area() {

        if( !((a+b)<c || (b+c)<a || (a+b)<b ) ){
        double p = (a+b+c)/2;
        //double s =Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
            else{
            return 0;}
    }

    @Override
    void ShowName() {
        System.out.println(name+pi);
    }
}
 class Tri extends Triangle{

     public Tri(double a, double b, double c) {
         super(a, b, c);
         System.out.println(pi);
     }

 }
