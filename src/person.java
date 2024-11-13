public class person {
    private String name;
    private int age ;
    private  String address;

    // عندك هون الconstructor افهم ايش بعمل

    public person (String name, int age, String address){

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayinfo(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("address: "+address);
    }
}
    

