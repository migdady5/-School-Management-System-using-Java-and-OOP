public class Teacher extends person {
    
    private String subject;
    private String employeeID;

    public Teacher(String address,int age,String name,String subject,String employeeID){
        
        super(name, age, address);
        this.subject = subject;
        this.employeeID = employeeID;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("subject: ="+ subject);
        System.out.println("employeeID: ="+ employeeID);
    }
}
