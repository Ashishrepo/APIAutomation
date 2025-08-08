class A{

    static void m(){

        System.out.println("Inside A-m");
    }

    final void j(){ // final methods cannot be overridden
        System.out.println("Inside A-j");
    }
}

class B extends A{

    static void m(){

        System.out.println("Inside B-m");  // Override means that only implementation should change
                                          // and not the return type and access modifier
                                          // static as well as non-static methods can be overirdden
    }



    static void m(int a){

        System.out.println(a);  // Overloading using Inheritance
                               // static as well as non-static methods can be overloaded
    }

    // super keyword is used to invoke immediate parent class variable  -> super.<variable name>
    // super keyword is used to invoke immediate parent class method--> super.<method name>


    static void callParent(){
        A.m();
    }


}




public class Overriding {
    public static void main(String[] args) {

        A.m();
    }
}
