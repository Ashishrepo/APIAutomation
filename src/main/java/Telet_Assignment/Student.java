package Telet_Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Student {

    private String name;
    private int age;
    private String studentID;
    List<String> courses;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                ", courses=" + courses +
                '}';
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }

    public List<String> getCourses() {
        return courses;
    }

    Student(String name, int age, String studentID) {

        if (validateAge(age) && validateName(name) && validateStudentID(studentID)) {

            this.name = name;
            this.age = age;
            this.studentID = studentID;
            courses = new ArrayList<String>();
        }
    }

    public void enrollCourse(String course) {
        if (validateCourse(course)) {
            if (!courses.contains(course)) {
                courses.add(course);
            } else {
                System.out.println("Student enrolled to " + course);
            }
        }
    }

        public void printStudentInfo () {

            System.out.println("**********Student Info**************");
            System.out.println("Student Name: " + name);
            System.out.println("Student Age: " + age);
            System.out.println("Student StudentID: " + studentID);
            System.out.println("Student courses: " + courses);

        }

        public boolean validateAge ( int age){

            if (age >= 19 && age <= 35) {
                return true;
            } else {
                System.err.println("Invalid Age. Student age should be btw 19-35");
                return false;
            }
        }

        public boolean validateName (String name){
            String namePattern = "^[a-zA-z\\s]+$";
            if (Pattern.compile(namePattern).matcher(name).matches()) {
                return true;
            } else {
                System.err.println("Invalid name");
                return false;
            }

        }

        public boolean validateStudentID (String studentID){

            String userIDPattern = "S-[0-9]+$";
            if (Pattern.compile(userIDPattern).matcher(studentID).matches()) {
                return true;
            } else {
                System.err.println("Invalid Student ID format");
                return false;
            }

        }

        public boolean validateCourse (String course){

            List<String> crs = Arrays.asList("Java", "Python", "Ruby");

            if (crs.stream().anyMatch(s -> s.equalsIgnoreCase(course))) {
                return true;
            } else {
                System.err.println("Invalid Course. Plz select course from list [Java,Pyhton,Ruby]");
                return false;
            }

        }

    }

