package Practise_Problems;

import java.util.HashSet;
import java.util.Set;

public class PrintEveryCharacterOnce {

    public static void main(String[] args) {

        String str= "aabcddefghiihj";
        Set<Character> st= new HashSet<Character>();
        for(int i=0;i<str.length();i++){

            st.add(str.charAt(i));
        }

        System.out.println(st);
        for(Character c:st){
            System.out.println(c);
        }

    }
}
