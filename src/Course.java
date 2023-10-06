import java.util.ArrayList;

public class Course implements User{

    private String courseCode;
    private  String courseName;
    private int maxCapacity;

    private  String type;
    private  Teacher assignedTeacher;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseCode, String courseName, int maxCapacity,String type) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.type=type;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getType() {
        return type;
    }

    public void setAssignedTeacher(Teacher assignedTeacher) {
        this.assignedTeacher = assignedTeacher;
    }

    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            System.out.println(student.name + " has been successfully enrolled in " + courseName + " (" +courseCode + ")");
            return true;
        } else {
            System.out.println("Sorry, " + courseName + " is already full. Cannot enroll " + student.getName() + ".");
            return false;
        }
    }
    @Override
    public void displayInformation() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Max Capacity: " + maxCapacity);
        System.out.println("Course Type:"+ type);
        System.out.println("Assigned Teacher: " + (assignedTeacher != null ? assignedTeacher.getName() : "Not assigned"));
        if (!enrolledStudents.isEmpty()) {
            System.out.println("Enrolled Students:");
            for (Student student : enrolledStudents) {
                System.out.println("  - " + student.getName());
            }
        } else {
            System.out.println("No students enrolled yet.");
        }
    }
}
