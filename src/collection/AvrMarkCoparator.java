package collection;

import java.util.Comparator;

public class AvrMarkCoparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2){
        return Double.compare(o1.get_averegeMark(),o2.get_averegeMark());
    }
}
