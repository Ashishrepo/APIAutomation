package SingleTonDesignPAttern;

public class C1 {

    //for single memory allocation
    private static C1 obj;

    // private constructor
    private C1(){
        System.out.println("Inside C1");
    }

    // method to create instance
    public static C1 createInstance(){
       if(obj==null){
        obj= new C1();
       }
        return obj;
    }
}
