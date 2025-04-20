package Streams_Selenium;

import java.util.HashMap;
import java.util.Map;

public class StreamSel_Map_1 {

    public static void main(String[] args){

        // MAp 2

        Map<String, Integer> mn= new HashMap<String, Integer>();
        mn.put("A",1);
        mn.put("B",2);
        mn.put("C",3);
        mn.put("D",2);

        mn.entrySet().stream().filter(m->m.getValue()==2).forEach(n-> System.out.println(n.getKey()));


        // Map 3 - to print duplicate characters

        Map<Character, Integer> kk= new HashMap<Character, Integer>();
        String s= "ashish";
        char[] sr = s.toCharArray();

        for(char c:sr){

            if(kk.containsKey(c)){
                kk.put(c,kk.get(c)+1);
            }else{
                kk.put(c,1);
            }

        }

        kk.entrySet().stream().filter(e->e.getValue()>1).forEach(e-> System.out.println(e.getKey()+": "+e.getValue()));

    }
}
