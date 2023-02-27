package AbstrClasses;

/* final - не наслідується класс/метод*/
/*у інтерфейсах "множинне" наслідування*/

public class Demonstration {

    static double GetArea(Figure f){
        return  f.Area();
    }
//показується реалізація з батьківськими класами
    //і можно для всіх і для 1го  - більше = видніше
    static String GetName(Figure f){//пізне звязування
        return f.GetName();
    }

    public static void main(String[] args) {

    Figure f1 = new Triangle(3,4,5);
    Figure f2 = new Circle(3.5);

    /***********************************/
    Figure smth = new Triangle(3.4,4.5,5.4);

    smth.setPi(3.15);

    smth.ShowName();

    Tri newval = new Tri(1,2,3);

    System.out.println("---End---");

    /*****************************************/
    double area;

/*
    f1.ShowName();
    f2.ShowName();*/

    area=GetArea(f1);//нам потрібен метод, що віклікав би метод з базового класса
        System.out.println("Area of triangle is " + area);


        String name1 = GetName(f2);
        System.out.println(name1);

        String name2 = GetName(f1);
        System.out.println(name2);



    }
}
