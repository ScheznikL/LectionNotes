package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> StudentList = Arrays.asList(
                new Student(19, 76.5,"Ann", "Shevchenko"),
                new Student(30,80.9, "Nick", "Lavenko"),
                new Student(22,99.9, "Layla", "Smith"),
                new Student(25,90.5, "Aurora", "Larchenko"),
                new Student(33,100, "Aurora", "LachShpack")
        );
        //just array, but List
        System.out.println("Compare FullName");
        StudentList.sort(new FullNameComparator());
        System.out.println(StudentList);
        System.out.println("Compare Age");
        StudentList.sort(new AgeComparator());
        System.out.println(StudentList);
        System.out.println("Compare Average Mark");
        StudentList.sort(new AvrMarkCoparator());
        System.out.println(StudentList);

        var BestStud = StudentList.get(0);
        for (var stud : StudentList) {
            if(stud.get_averegeMark() > BestStud.get_averegeMark()){
                BestStud = stud;
            }
        }
        System.out.println("Best student is " + BestStud);
//Iterator <Student>= new Iterator<>();

    }






}
