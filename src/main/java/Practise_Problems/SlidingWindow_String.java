package Practise_Problems;

import io.cucumber.java.sl.In;

import java.util.HashMap;

public class SlidingWindow_String {


    private static String s ="abcadefjhaee";

    public static void main(String[] args) {

        System.out.println("Max Length "+getMaxLength(s));

    }

    private static int getMaxLength(String s) {

        int start=0;
        int maxlength=0;
        HashMap<Character, Integer>mp = new HashMap<Character,Integer>();


        for(int end=0;end<s.length();end++){

            char current=s.charAt(end);
            if(mp.containsKey(current)){
                start=Math.max(start,mp.get(current)+1);
            }

            // replace index value of a to new index value in map
            mp.put(current,end); //a=0  b=1  c=2 a=3
            maxlength=Math.max(maxlength,end-start+1);
        }

        return maxlength;

    }


}
