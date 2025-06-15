package Practise_Problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        String roman= "VII";
        Map<Character,Integer> rmap= new HashMap<Character,Integer>();
        rmap.put('I',1);
        rmap.put('V',5);
        rmap.put('X',10);

        int currentValue=0;
        int previousValue=0;
        int result=0;

        for(int i=roman.length()-1;i>=0;i--){

            currentValue=rmap.get(roman.charAt(i));

            if(currentValue>=previousValue){
                result=result+currentValue;
            }else {
                result =result-currentValue;
            }

            previousValue=currentValue;
        }

        System.out.println("Result "+result);

    }
}
