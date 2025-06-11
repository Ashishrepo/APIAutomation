package Practise_Problems;

import io.cucumber.java.be.I;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharInString {

    public static void main(String[] args) {

        String s= "Ashish@!#!#";
        Map<Character, Integer> mp = new HashMap<Character,Integer>();


        char[] sp= s.toCharArray();

        for(Character n:sp){

            if(mp.containsKey(n)){
                mp.put(n,mp.get(n)+1);
            }else{
                mp.put(n,1);
            }
        }

        for (char c:mp.keySet()){
            System.out.println(c+ "  ---->"+mp.get(c));

        }

    }
}
