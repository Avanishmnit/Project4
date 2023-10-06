interface Teachable{
    void study();
    void submitAssignment(String assignment);
}

public class Student implements User {

    protected String name;
    private String Id;

    private  int age;
    private String address;
    private String student_Type;

    public Student(String name, String Id, int age, String address,String student_Type) {
        this.name = name;
        this.Id = Id;
        this.age = age;
        this.address=address;
        this.student_Type=student_Type;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name:" + name);
        System.out.println("Id:" + Id);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
        System.out.println("Student_Type: "+student_Type);

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public String getStudent_Type() {
        return student_Type;
    }
}

class UnderGraduatestudent extends Student implements  Teachable{


    private String major;
    public UnderGraduatestudent(String name, String id, int age,String address,String Student_Type , String major) {
        super(name, id, age,address,Student_Type);
        this.major=major;
    }
    public void displayMajor() {
        System.out.println("Major: " + major);
    }

    @Override
    public void study() {

        System.out.println("Undergraduate student " + name + " is studying.");
    }

    @Override
    public void submitAssignment(String assignment) {
        System.out.println("Undergraduate student " + name + " is submitting an assignment: " + assignment);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Major:"+ major);
        study();
        submitAssignment("CN");
    }
}

class PostGraduatestudent extends Student implements  Teachable{

    private String program;
    public PostGraduatestudent(String name, String id, int age,String address,String Student_Type,String program) {
        super(name, id, age,address,Student_Type);
        this.program= program;
    }

    public void displayProgram() {
        System.out.println("Program: " + program);
    }
    @Override
    public void study() {

        System.out.println("Postgraduate student " + name + " is studying.");
    }

    @Override
    public void submitAssignment(String assignment) {
        System.out.println("Postgraduate student " + name + " is submitting an assignment: " + assignment);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Program: " + program);
        study();
        submitAssignment("AI");
    }
}



