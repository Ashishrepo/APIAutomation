package Telet_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MAIN_2 {


    public static List<Student> listStudent;


    public static void main(String[] args) {

        System.out.println("********** Welcome to MAIN 2***********");
        Student s1;

        s1 = new Student("Ashish Jain", 22, "S-1");
        s1.enrollCourse("Java");

        Student s2 = new Student("Yash", 24, "S-2");
        s2.enrollCourse("Pyhton");

        Student s3 = new Student("Varun", 26, "S-3");
        s2.enrollCourse("Ruby");

        listStudent = new ArrayList<Student>();
        //add all Student object to list
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);

        System.out.println(findStudentByID("S-1"));
//        System.out.println(findStudentByID("S-10"));

        sortByName();

    }


    public static Student findStudentByID(String studentID) {

        return listStudent.stream().filter(x -> x.getStudentID().equalsIgnoreCase(studentID))
                .findFirst().orElseThrow(() -> new RuntimeException("No Student ID found with ->" + studentID));
    }

    private static void sortByName() {

        Comparator<Student> studentNameComparator = ((o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(listStudent,studentNameComparator);

        System.out.println(listStudent);
    }
}
