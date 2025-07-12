package Telet_Assignment;

import java.util.*;

import static java.lang.System.exit;

public class MAIN_3 {


    public static List<Student> listStudent;
    public static  Scanner sc;

    public static void main(String[] args) {

        System.out.println("********** Welcome to MAIN 2***********");
        Student s1;

        listStudent = new ArrayList<Student>();
        sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter below option");
            System.out.println("1: Register Student");
            System.out.println("2: Find Student with Student ID");
            System.out.println("3: List all student information");
            System.out.println("4: List all student info in sorted order");
            System.out.println("5: Exit");
            int option = sc.nextInt();

            switch (option) {

                case 1:
                    enrolStudent(sc);
                    break;
                case 2:
                    findStudentBystudentID(sc);
                    break;
                case 3:
                    printallStudentData();
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    exit();
                    break;

                default:
                    System.out.println("Invalid Option selected. Enter between 1 -5");
            }

        }
    }

    private static void exit() {

        System.exit(0);
    }

    private static void printallStudentData() {

        if(!listStudent.isEmpty()){
            listStudent.forEach(System.out::println);
        }else{
            System.err.println("Student List is Empty....");
        }

    }

    private static void findStudentBystudentID(Scanner sc) {

        System.out.println("Enter student ID to find");
        String studentID = sc.next();
        Student found=null;

        try {
            found= listStudent.stream().filter(x -> x.getStudentID().equalsIgnoreCase(studentID))
                    .findFirst().orElseThrow(() -> new RuntimeException("No Student ID found with ->" + studentID));
        } catch (RuntimeException e) {
            System.err.println("Student ID not found");
        }

        found.printStudentInfo();


    }

    private static void enrolStudent(Scanner sc) {

        System.out.println("Enter student name:");
        String studentName = sc.next();

        System.out.println("Enter student age:");
        int studentAge = sc.nextInt();

        System.out.println("Enter student ID:");
        String studentID = sc.next();

        Student studentObj = new Student(studentName,studentAge,studentID);
        listStudent.add(studentObj);

        while(true) {
            System.out.println("Enter student courses. If done type EXIT");
            String studentCourse = sc.next();
            if(studentCourse.equalsIgnoreCase("Exit")){
                break;
            }

            studentObj.enrollCourse(studentCourse);

        }
        studentObj.printStudentInfo();



    }


    public static Student findStudentByID(String studentID) {

        return listStudent.stream().filter(x -> x.getStudentID().equalsIgnoreCase(studentID))
                .findFirst().orElseThrow(() -> new RuntimeException("No Student ID found with ->" + studentID));
    }

    private static void sortByName() {

        Comparator<Student> studentNameComparator = ((o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(listStudent,studentNameComparator);
        printallStudentData();
    }
}
