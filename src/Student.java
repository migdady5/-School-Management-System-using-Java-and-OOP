public class Student extends person {
    private String studentID;
    private double grade;

    public Student(String name,int age,String address,String studentID){
        super(name, age, address);
        this.studentID = studentID;
        this.grade = 0.0;
    }
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("studentID: =" +studentID);
        System.out.println("Greade: ="+grade);
    }
     
}
