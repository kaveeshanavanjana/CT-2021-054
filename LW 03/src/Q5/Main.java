package Q5;

public class Main {
    public static void main(String[] args) {


   // lecturer objct
        Lecturer lecturer1 = new Lecturer("Mr.Kesavan Selvarajah", "Object Oriented Programming");
        Lecturer lecturer2 = new Lecturer("Dr.Kasun Fernando", "Data Structures");

    // course object
        Course course1 = new Course("Object Oriented Programming", "CT22043", lecturer1);
        Course course2 = new Course("Data Structures", "CT22061", lecturer2);

    //  student object
        Student student1 = new Student("Kaveesha ", "Bachelor of Information Communication Technology", course1.getCourseName());
        Student student2 = new Student("Jane Smith", "Bachelor of Computer Science", course2.getCourseName());


        System.out.println("Student Name: " + student1.getStudentName());
        System.out.println("Degree Name: " + student1.getDegreeName());
        System.out.println("Course Following: " + student1.getCourseFollowing());
        System.out.println("Lecturer Name: " + course1.getLecturer().getLecturerName());
        System.out.println("Course Code: " + course1.getCourseCode());
        System.out.println();

        System.out.println("Student Name: " + student2.getStudentName());
        System.out.println("Degree Name: " + student2.getDegreeName());
        System.out.println("Course Following: " + student2.getCourseFollowing());
        System.out.println("Lecturer Name: " + course2.getLecturer().getLecturerName());
        System.out.println("Course Code: " + course2.getCourseCode());





 }


}
