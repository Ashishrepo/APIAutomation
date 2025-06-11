package Practise_Problems;

import java.util.HashMap;
import java.util.Map;

public class CountOfSpecialCharInString {

    public static void main(String[] args) {

        String nm= "As@!123@!% ";

        char []ch =nm.toCharArray();
        Map<Character,Integer> mp = new HashMap<Character,Integer>();

        for(Character c:ch){

            if(!((c>='a'&&c<='z') || (c>='A'&&c<='z') || (c>='0'&& c<='9') || (c==' '))){
                if(mp.containsKey(c)){
                    mp.put(c,mp.get(c)+1);
                }else{
                    mp.put(c,1);
                }

            }
        }

        for(char key:mp.keySet()){

            System.out.println(key +"---->"+mp.get(key));

        }


    }
}
