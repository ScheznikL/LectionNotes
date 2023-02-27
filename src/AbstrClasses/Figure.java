package AbstrClasses;

public abstract class Figure {

    protected String name = "";
    protected double pi = 3.1415;
    public void setPi(double pi) {
        this.pi = pi;
    }

    // because we don't forbid to take it

    //коли наслідування 2х класів тут модифік  доступу

//final - zaborona!
     abstract double Area();
     abstract void ShowName();

     String GetName(){
         return name;
     }

    //override - анотація про те що ми перевизначаємо метод
}