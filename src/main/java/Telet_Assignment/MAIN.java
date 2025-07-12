package Telet_Assignment;

public class MAIN {

    public static void main(String[] args) {

        System.out.println("********** Welcome to MAIN***********");
        Student s1;
        s1 = new Student("Ashish Jain",22,"S-1");
        s1.enrollCourse("Java");
        s1.enrollCourse("Java");
        s1.enrollCourse("C++");
        System.out.println(s1);
    }
}
