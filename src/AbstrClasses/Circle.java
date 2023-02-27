package AbstrClasses;

public class Circle extends Figure {//наслідувалли
//super - без абстракції
    double r;

    public Circle(double r) {
        this.r = r;
        name = "Circle";
    }


    @Override
    protected double Area() {
        return pi*r*r;
    }

    @Override
    protected void ShowName() {
        System.out.println("Circle");
    }
}
