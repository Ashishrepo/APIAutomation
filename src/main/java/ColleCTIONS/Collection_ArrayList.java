package ColleCTIONS;


// can store hetrogeneous as well as homogenous elements
// maintains insertion order -use Index to store elements
// Duplictes --allowed
// multiple null values --allowed


import java.util.ArrayList;
import java.util.Arrays;

public class Collection_ArrayList {

    public static void main(String[] args) {


        ArrayList ls = new ArrayList();
        ls.add(1);
        ls.add("Ashish");
        ls.add(true);
        ls.add('E');
        ls.add(null);
        ls.add(1);


        //print all elements
        System.out.println(ls);

        // insert one element
        ls.add(3,"Java");
        System.out.println("After Inserting-->"+ls);

        // remove one element
        ls.remove(3);
        System.out.println("After removing-->"+ls);

        // modify element
        ls.set(2,false);
        System.out.println("After Mofidying --->"+ls);


        // remove mulitple elements
        ArrayList ls1 =new ArrayList();
        ls1.add("Ashish");
        ls1.add('E');

        ls.removeAll(ls1);
        System.out.println("After removing multiple elements-->"+ls);

        // remove based on condition
        ArrayList <String>ls2 = new ArrayList<String>();
        ls2.addAll(Arrays.asList("GH","Gaurav","Ashish","Gautam","Varun"));

        ls2.removeIf(x->x.startsWith("G"));

        System.out.println("After removing based on condition-->"+ls2);


        // fetch elements using index
        System.out.println("Fetch elements using Index-----");
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }




    }
}
