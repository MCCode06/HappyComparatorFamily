import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = 0;
        if (o1.grade != o2.grade) {
            return Float.compare(o2.grade, o1.grade);
        }
        else if (o1.birthYear != o2.birthYear) {
            return Integer.compare(o1.birthYear, o2.birthYear);
        }
        else if (o1.gender != o2.gender) {
            return Boolean.compare(o2.gender, o1.gender);       // as female is true and male is false
        }                                                       // (java treats true>false) this will work just fine
        else if (!(o1.surname.equals(o2.surname))) {
            return o1.surname.compareTo(o2.surname);
        }
        else if (!(o1.name.equals(o2.name))) {
            return o2.name.compareTo(o1.name);
        }
        else if (o1.id != o2.id) {
            return Integer.compare(o1.id, o2.id);
        }

        return result;
    }
}
