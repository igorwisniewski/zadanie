import java.util.List;
import java.util.Objects;

public class University {
    private List<Student> students;

    public void addStudent(String name, String surname){
        students.add(new Student(name, surname));
    }
    public Student getStudent(String name, String surname){
        for (Student student: students){
            if(Objects.equals(student.getName(), name) && Objects.equals(student.getSurname(), surname)){
                return student;
            }
        }
        return null;
    }
    public boolean removeStudent(String name, String surname){
        for (Student student: students) {
            if (Objects.equals(student.getName(), name) && Objects.equals(student.getSurname(), surname)) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
}
