import java.util.*;

public class Student implements Comparable<Student> {
    public int id;
    public String name;
    public String surname;
    public float grade;
    public boolean gender;
    public int birthYear;

    public Student(int id, String name, String surname, float grade, boolean gender, int birthYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        String genderS = gender ? "M" : "F";
        return String.format("{name = '%s', surname = '%s', birth = %d, gender = %s, id = %d, grade = %f}",
                name, surname, birthYear, genderS, id, grade);
    }

}