package ColleCTIONS;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class CollecTION_MAP {

    public static void main(String[] args) {

        Map<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(100,"Ashish");
        mp.put(200,"Ayush");
        mp.put(300,"Yash");
        mp.put(400,"Ashish");

        System.out.println(mp);

        System.out.println("keySet-->"+ mp.keySet());
        System.out.println("values-->"+mp.values());
        System.out.println("Entry set -->"+mp.entrySet());

        for(int key:mp.keySet()){

            System.out.println(mp.get(key));
        }


        // insertion not allowed . We can only add using put

        // remove
        mp.remove(100);
        System.out.println("After remove --->"+mp.entrySet());

    }
}
