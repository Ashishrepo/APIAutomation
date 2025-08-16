package Interface;

import org.openqa.selenium.support.PageFactory;

public class implementingClass extends ProjectRecord implements Emp1, Emp2{


    @Override
    public void projectsEmp1() {
        System.out.println("Pemp1");
    }

    @Override
    public void projectsEmp2() {

         System.out.println("Pemp2");
    }

    public static void main(String[] args) {
        implementingClass obj = new implementingClass();
        Emp1 obj1 = new implementingClass();

        //abstrct methods
        obj.projectsEmp1();
        obj.projectsEmp2();


        // static methods of Interface
        Emp1.empStaticEmp1();
        Emp2.empStaticEmp2();

        //defaul methods of Interface
        obj.empDefaultEmp1();
        obj.empDefaultEmp2();

        System.out.println(Emp1.companyName);
        System.out.println(Emp1.empCounts);
        System.out.println(Emp2.companyName);
        System.out.println(Emp2.empCounts);


        //parent class
        obj.m();
        System.out.println(obj.projects);

        System.out.println("*****************************");
        obj1.projectsEmp1();
    }
}
