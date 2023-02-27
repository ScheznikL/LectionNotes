package exaption;

public class TestEx {
    double DivNumbers(int a, int b) {
        double res = 0;

        try{
            res = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Div by xero " + e.getStackTrace());//оно ли всегда видно или только если задать .точтонадо()
        }
        return res;
    }

    public static void main(String[] args) {
        TestEx testEx = new TestEx();
        double rez = testEx.DivNumbers(1,0);
    }

}
