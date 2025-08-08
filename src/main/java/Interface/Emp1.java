package Interface;

public interface Emp1 {

    String companyName = "GL";    // static final
    int empCounts=5000;


   void projectsEmp1(); // abstract and public


    //static method introduced from Java 8
   static void empStaticEmp1(){
       System.out.println("inside Interface static method");
   }

    //default method introduced from Java 8
   default void empDefaultEmp1(){
       System.out.println("Inside Interface default method");
   }





}
