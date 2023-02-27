package InterfacesNestedCl;
//cntrl shist
public class Car {



    double speed;
    String model;
    Motor motor = new Motor(1000);
    Weels weels = new Weels(4);
    public Car(double speed, String model) {
        this.speed = speed;
        this.model = model;

        weels.weels=4;
    }
    @Override
    public String toString() {
        return model + " has speed " + speed + " has horsePower " + motor.horsePower + " and colesa" + weels.weels ;
    }
    double Drive(){
        return speed++;
    }
    double Stop(){
        return speed=0.00;
    }

    class Motor{

       private double horsePower;
        public Motor(double horsePower) {
            this.horsePower = horsePower;
        }

        public void setHorsePower(double horsePower) {
            this.horsePower = horsePower;
        }

        public double getHorsePower() {
            return horsePower;
        }
    }

    static class Weels{

        private int weels;

        public Weels(int weels) {
            this.weels = weels;
        }

        public void setWeels(int weels) {
            this.weels = weels;
        }

        public int getWeels() {
            return weels;
        }
    }

    void changeCar(double speed, double horsePower, int colesa){
        this.speed = speed;
        motor.setHorsePower(horsePower);
        weels.setWeels(colesa);
    }
}


