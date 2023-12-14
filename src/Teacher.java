interface Educator{
    void teach();
    void assess();
    void communicate();
}
public class Teacher implements User {
    protected String name;
    private String Id;

    private  int age;

    private  String address;

   private String qualification;
   private String designation;
   private String experience;

    public Teacher(String name, String id, int age, String address, String qualification, String designation,String experience) {
        this.name = name;
        Id = id;
        this.age = age;
        this.address = address;
        this.qualification = qualification;
        this.designation=designation;
        this.experience = experience;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name :" + name);
        System.out.println("Id :" + Id);
        System.out.println("Age :" + age);
        System.out.println("Address :" + address);
        System.out.println("Qualification : " +qualification);
        System.out.println("designation:"+ designation);
        System.out.println("Year of experience :" + experience);
        System.out.println("All Teachers are good");
        //Adding Some Extra feature

    }

    public String getName() {
        return  name;
    }

    public String getId() {
        return Id;
    }
}

class AssistantProfessor extends Teacher implements Educator{
    private String researchArea;
    public AssistantProfessor(String name, String id, int age, String address, String qualification,String designation, String experience,String researchArea) {
        super(name, id, age, address, qualification,designation, experience);
        this.researchArea= researchArea;
    }

    @Override
    public void teach() {
        System.out.println("Assistant Teacher " + name + " is assisting in teaching.");
    }

    @Override
    public void assess() {
        System.out.println("Assistant Teacher " + name + " is assessing student performance.");
    }

    @Override
    public void communicate() {
        System.out.println("Assistant Teacher " + name + " is communicating with students.");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Research Area:" + researchArea);
        teach();
        assess();
        communicate();
    }
}


class AssociateProfessor extends Teacher implements Educator{
    private String specialization;

    public AssociateProfessor(String name, String id, int age, String address, String qualification, String designation, String experience, String specialization) {
        super(name, id, age, address, qualification, designation, experience);
        this.specialization = specialization;
    }

    @Override
    public void teach() {
        System.out.println("AssociateProfessor " + name + " is assisting in teaching.");
    }

    @Override
    public void assess() {
        System.out.println("AssociateProfessor " + name + " is assessing student performance.");
    }

    @Override
    public void communicate() {
        System.out.println("AssociateProfessor " + name + " is communicating with students.");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Specialization:"+ specialization);
        teach();
        assess();
        communicate();
    }
}



class Professor extends Teacher implements Educator{
    private String achievement;

    public Professor(String name, String id, int age, String address, String qualification,String designation, String experience, String achievement) {
        super(name, id, age, address, qualification,designation, experience);
        this.achievement=achievement;
    }

    @Override
    public void teach() {
        System.out.println("Professor " + name + " is assisting in teaching.");
    }

    @Override
    public void assess() {
        System.out.println("Professor " + name + " is assessing student performance.");
    }

    @Override
    public void communicate() {
        System.out.println("Professor " + name + " is communicating with students.");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Achievement:"+ achievement);
        teach();
        assess();
        communicate();
    }
}




