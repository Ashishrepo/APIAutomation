package Practise_Problems;

public class vowel_2 {

    public static void main(String[] args) {

        String nm="AsHish";
        String vowel="aeiouAEIOU";

        char [] ch=nm.toCharArray();

        for(int i=0;i<ch.length;i++){

            if(vowel.indexOf(ch[i])!=-1){
               ch[i]='x';
            }

        }

        System.out.println("new String ->"+new String(ch));
    }
}
