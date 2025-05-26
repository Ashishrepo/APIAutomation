package SingleTonDesignPAttern;

public class C2 {

    public static void main(String[] args){


        C1 obj1 = C1.createInstance();
        C1 obj2 = C1.createInstance();

        System.out.println(obj1);
        System.out.println(obj2);



         }
}
