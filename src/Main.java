import java.util.*;

public class Main {
   private static final List<Student> students= new ArrayList<>();
   private static final List<Teacher> teachers = new ArrayList<>();
    private static final List<Course> courses= new ArrayList<>();
   private static final HashMap<String, Course>courseMap= new HashMap<>();

    public static void main(String[] args) {
       UnderGraduatestudent Avanish= new UnderGraduatestudent("Avanish","2019UCP1582",12,"Bangawa","UG","Mechanical Engineering");
        UnderGraduatestudent Akash= new UnderGraduatestudent("Akash","2019UCP1583",12,"Sahjanwa","UG","Electronics And Communication");
        UnderGraduatestudent Prashant= new UnderGraduatestudent("Prashat","2019UCP1584",12,"Bangaluru","UG","Computer Science");

        PostGraduatestudent Vishwajeet= new PostGraduatestudent("Vishwajeet","2019UCP1585",12,"Aligargh","PG","Data Scientist");
        PostGraduatestudent Himanshu= new PostGraduatestudent("Himanshu","2019UCP1586",12,"Jaipur","PG","Computer Networking");
        students.add(Avanish);
        students.add(Akash);
        students.add(Prashant);
        students.add(Vishwajeet);
        students.add(Himanshu);


        AssistantProfessor Ramesh = new AssistantProfessor("Dr Ramesh Babu Batula","RAMESH19",32,"Jaipur","PHD &M.phil","Assistant","3 Years"," Computer Science");
        AssistantProfessor Goplani = new AssistantProfessor("Dr. Dinesh Goplani","GOPALANI19",31,"Jaipur","PHD & M.tech","Assistant","4 Years"," Electronics and Communication");
        AssistantProfessor Ashish = new AssistantProfessor("Dr.Ashish Tripathi","ASHISH19",30,"Jaipur","PHD & M.TEch","Assistant","4 Years"," Electrical ");

        AssociateProfessor Jyoti= new AssociateProfessor("Dr.Jyoti Grover","JYOTI19",38,"Jaipur","M.Tech & PHD","Associate","8 years","Automata and Digital electronics");
        AssociateProfessor Minakshi= new AssociateProfessor("Dr.Minakshi Tripathi","MINAKSHI19",37,"Jaipur","M.Tech & PHD","Associate","5 years","Computer Network and Security");
        AssociateProfessor Neeta= new AssociateProfessor("Dr.Neeta Nain","NEETA19",45,"Jaipur","M.Tech & PHD","Associate","12 years","Graphics desining and Machine learing");

        Professor Girdhari= new Professor("Prof Girdhari Singh","GIRDHARI19",60,"UdaiPur","M.Tech & PHD","Prof ","30 Years","ICECI 2023 International Conference paper2 for Paper: An Expert system for analyzing the behavior of students in the higher Education given by AMU Aligarh");
        Professor VijayLakshmi= new Professor("Prof VijayLakshmi","VIJAYLAKSHMI19",55,"UdaiPur","MS & PHD","Prof ","32 Years","- Career Award for Young Teachers Achievement for CAYT given by All India Council for Technical Education");

        teachers.add(Ramesh);
        teachers.add(Girdhari);
        teachers.add(Goplani);
        teachers.add(Ashish);
        teachers.add(VijayLakshmi);
        teachers.add(Jyoti);
        teachers.add(Minakshi);
        teachers.add(Neeta);

        Course DSA= new Course("CST101","DSA",50,"Advanced");
        Course JAVA= new Course("CST102","JAVA",50,"Advanced");
        Course C= new Course("CST103","C",2,"Introductory");
        Course Python= new Course("CST104","Python",50,"Introductory");
        Course DS= new Course("CST105","DS",50,"Introductory");
        Course DBMS= new Course("CST106","DBMS",50,"Advanced");
        courses.add(DSA);
        courseMap.put("CST101",DSA);
        courses.add(JAVA);
        courseMap.put("CST102",JAVA);
        courses.add(C);
        courseMap.put("CST103",C);
        courses.add(Python);
        courseMap.put("CST104",Python);
        courses.add(DS);
        courseMap.put("CST105",DS);
        courses.add(DBMS);
        courseMap.put("CST10106",DBMS);

        System.out.println("*******Student Information*******");
        for (Student student:students){
            student.displayInformation();
        }

        System.out.println("_".repeat(25));

        System.out.println("*******Teacher Information*******");

        for (Teacher teacher:teachers){
            teacher.displayInformation();
        }

        System.out.println("_".repeat(25));

        System.out.println("*******Course Information*******");
        for (Course course:courses){
            course.displayInformation();
        }


        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCollege Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Create Course");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Assign Teacher to Course");
            System.out.println("6. Display Course Information");
            System.out.println("7. Display Student Information");
            System.out.println("8. Display Teacher Information");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addStudent(scanner);
                case 2 -> addTeacher(scanner);
                case 3 -> createCourse(scanner);
                case 4 -> enrollStudentInCourse(scanner);
                case 5 -> assignTeacherToCourse(scanner);
                case 6 -> displayCourseInformation(scanner);
                case 7 -> displayStudentInformation(scanner);
                case 8 -> displayTeacherInformation(scanner);
                case 9 -> System.out.println("Exiting the program.");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
        scanner.close();

    }
    private static void addStudent(Scanner scanner) {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        name=name.toLowerCase();
        name = name.substring(0,1).toUpperCase().concat(name.substring(1));
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        studentID=studentID.toUpperCase();
        System.out.println("Enter Student type UG/PG");
        String studentType=scanner.nextLine();
        studentType=studentType.toUpperCase();
        if (studentType.equals("UG")){
            System.out.println("Enter Major");
            String major= scanner.nextLine();
            boolean exist= false;
            for(Student student: students){
                if(studentID.equals(student.getId())){
                    System.out.println("Student Id Already Exist please Enter Different ID");
                    exist= true;
                }
            }
            if(!exist){
                UnderGraduatestudent student = new UnderGraduatestudent(name, studentID,age,address,studentType,major );
                students.add(student);
                System.out.println("Student added successfully.");
            }

        } else if (studentType.equals("PG")) {
            System.out.println("Enter Program");
            String program= scanner.nextLine();
            boolean exist=false;
            for(Student student: students){
                if(studentID.equals(student.getId())){
                    System.out.println("Student Id Already Exist please Enter Different ID");
                    exist= true;
                }
            }
            if(!exist){
                PostGraduatestudent student = new PostGraduatestudent(name, studentID,age,address,studentType,program );
                students.add(student);
                System.out.println("Student added successfully.");
            }

        }
        else {
            System.out.println("Invalid Student Type Please Enter UG/PG");
        }
    }

    private static void addTeacher(Scanner scanner) {
        System.out.print("Enter Teacher Name: ");
        String name = scanner.nextLine();
        name=name.toLowerCase();
        name = name.substring(0,1).toUpperCase().concat(name.substring(1));
        System.out.print("Enter Teacher Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Teacher Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Teacher ID: ");
        String teacherID = scanner.nextLine();
        teacherID= teacherID.toUpperCase();
        System.out.println("Enter Teacher designation(Assistant /Associate/prof)");
        String teacherDesignation=scanner.nextLine();
        System.out.println("Enter Teacher Qualification");
        String qualification= scanner.nextLine();
        System.out.println("Enter Years of Experience");
        String experience= scanner.nextLine();
        if (teacherDesignation.equalsIgnoreCase("Assistant")){
            System.out.println("Enter ResearchArea");
            String researchArea= scanner.nextLine();
            AssistantProfessor prof= new AssistantProfessor(name,teacherID,age,address,qualification,teacherDesignation,experience,researchArea);
            teachers.add(prof);
            System.out.println("Teacher added successfully.");
        } else if (teacherDesignation.equalsIgnoreCase("Associate")) {
            System.out.println("Enter Specialization");
            String specialization= scanner.nextLine();
            AssociateProfessor associateProfessor = new AssociateProfessor(name, teacherID, age, address, qualification, teacherDesignation, experience, specialization);
            teachers.add(associateProfessor);
            System.out.println("Teacher Added successfully");

        } else if (teacherDesignation.equalsIgnoreCase("Prof")) {
            System.out.println("Enter achievement");
            String achievement= scanner.nextLine();
           Professor prof= new Professor(name,teacherID,age,address,qualification,teacherDesignation, experience,achievement);
           teachers.add(prof);
            System.out.println("Teacher added successfully.");
        }
        else {
            System.out.println("Invalid Teacher Type");
        }

    }

    private static void createCourse(Scanner scanner){
        System.out.println("Enter the Type of Course You Want to Add Advanced/Introductory");
        String type= scanner.nextLine();
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        courseCode=courseCode.toUpperCase();
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        courseName=courseName.toUpperCase();
        System.out.print("Enter Max Capacity: ");
        int maxCapacity = scanner.nextInt();
        if(type.equalsIgnoreCase("Advanced")){
            Course course = new Course(courseCode, courseName, maxCapacity,type);
            courses.add(course);
       courseMap.put(courseCode,course);
       System.out.println("Course created successfully.");
        } else if (type.equalsIgnoreCase("Introductory")) {
            Course course = new Course(courseCode, courseName, maxCapacity,type);
            courses.add(course);
        courseMap.put(courseCode,course);
       System.out.println("Course created successfully.");
        } else {
            System.out.println("Please Enter Valid Course Type");
        }

    }

    private static void enrollStudentInCourse(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        studentID=studentID.toUpperCase();
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        courseCode=courseCode.toUpperCase();
        Student student = findStudent(studentID);
        Course course = courseMap.get(courseCode);

        if (student == null || course == null) {
            System.out.println("Invalid Student ID or Course Code.");
            return;
        }
        boolean enrolled = course.enrollStudent(student);
        if (enrolled) {
            System.out.println("Hi,"+ student.getName()+ " Welcome to the Course");
        }
    }

    private static void assignTeacherToCourse(Scanner scanner) {
        System.out.print("Enter Teacher ID: ");
        String teacherID = scanner.nextLine();
        teacherID=teacherID.toUpperCase();
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        courseCode=courseCode.toUpperCase();

        Teacher teacher = findTeacher(teacherID);
        Course course = courseMap.get(courseCode);

        if (teacher == null || course == null) {
            System.out.println("Invalid Teacher ID or Course Code.");
        }
        else if(teacher instanceof Professor && course.getType().equals("Advanced")){
            course.setAssignedTeacher(teacher);
            System.out.println("Teacher assigned to the course successfully.");
        }
        else if((teacher instanceof AssistantProfessor || teacher instanceof AssociateProfessor) && course.getType().equals("Introductory")){
            course.setAssignedTeacher(teacher);
            System.out.println("Teacher assigned to the course successfully.");
        } else {
            System.out.print("Teacher is not Qualified to Teach");
        }

    }

    private static void displayCourseInformation(Scanner scanner) {
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        courseCode=courseCode.toUpperCase();

        Course course = courseMap.get(courseCode);

        if (course == null) {
            System.out.println("Course Not found.");
        } else {
            course.displayInformation();
        }
    }

    private static void displayStudentInformation(Scanner scanner) {
        System.out.print("Enter Student Id ");
        String studentId= scanner.nextLine();
        studentId= studentId.toUpperCase();
        boolean found= false;
        for( Student student: students){
            if(Objects.equals(student.getId(), studentId)){
                found= true;
                student.displayInformation();
                break;
            }
        }

        if(!found){
            System.out.println("Student Not found");
        }
    }

    private static void displayTeacherInformation(Scanner scanner) {
        System.out.print("Enter Teacher Id: ");
        String teacherId= scanner.nextLine();
        teacherId= teacherId.toUpperCase();
        boolean found= false;
        for( Teacher teacher: teachers){
            if(Objects.equals(teacher.getId(), teacherId)){
                found= true;
                teacher.displayInformation();
            }
        }
        if(!found){
            System.out.println(" Teacher Not Found");
        }
    }



    private static Student findStudent(String studentID) {
        for (Student student : students) {
            if (student.getId().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    private static Teacher findTeacher(String teacherID) {
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(teacherID)) {
                return teacher;
            }
        }
        return null;
    }



}
