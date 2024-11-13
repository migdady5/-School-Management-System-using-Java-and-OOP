public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ali", 20, "Amman", "S123");
        Student student2 = new Student("Sara", 22, "Irbid", "S124");
        Teacher teacher1 = new Teacher("Mr. John", 40, "Amman", "Math", "T001");
        Teacher teacher2 = new Teacher("Ms. Emily", 35, "Zarqa", "English", "T002");

        School school = new School("Amman High School");
        school.addStudent(student1);
        school.addStudent(student2);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        school.displaySchoolInfo();
    }
}
