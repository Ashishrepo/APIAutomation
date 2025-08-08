package Interface;

public interface Emp2 {

    String companyName = "Adpbe";    // static final
    int empCounts=7000;


    void projectsEmp2(); // abstract and public


    //static method introduced from Java 8
    static void empStaticEmp2(){
        System.out.println("inside Interface static method Emp2");
    }

    //default method introduced from Java 8
    default void empDefaultEmp2(){
        System.out.println("Inside Interface default method Emp2");
    }
}
