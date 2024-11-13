import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Student> students;
    private List<Teacher> teachers;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void displaySchoolInfo() {
        System.out.println("School: " + schoolName);
        System.out.println("Students: ");
        for (Student student : students) {
            student.displayinfo();
        }
        System.out.println("Teachers: ");
        for (Teacher teacher : teachers) {
            teacher.displayinfo();
        }
    }
}

