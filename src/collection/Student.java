package collection;

public class Student {
    private int _age;
    private double _averegeMark;
    private  String _Name, _Surname;

    public String getFullName() {
        return _Name + " " + " " + _Surname;
    }

    public void setFullName(String fullName) {
        FullName = getFullName();
    }

    private String  FullName;

    public Student(int _age, double _averegeMark, String _Name, String _Surname) {
        this._age = _age;
        this._averegeMark = _averegeMark;
        this._Name = _Name;
        this._Surname = _Surname;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public double get_averegeMark() {
        return _averegeMark;
    }

    public void set_averegeMark(double _averegeMark) {
        this._averegeMark = _averegeMark;
    }

    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public String get_Surname() {
        return _Surname;
    }

    public void set_Surname(String _Surname) {
        this._Surname = _Surname;
    }

    @Override
    public String toString() {
        return "Student "+ _Surname + " "
                +_Name + " " + _age
                + " years old, has average mark equal to "
                + _averegeMark + '\n';
    }


}
