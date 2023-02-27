package collection;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("Olga");
        arrlist.add(0,"40");
        arrlist.set(1,"50");// like replace
        //removeAll видаляє все спільне у списку
        //retainall видаляє з 1го списку те що що ?...
        arrlist.add("SomeOne");
        arrlist.add("SomeNone");
        arrlist.subList(1,3);//підмножина
        // але 1-5 буде по 4й якщо з 5м треба зазнашити 1-6

    }
}
