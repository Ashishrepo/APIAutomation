package Practise_Problems;

public class Reverse_OnlyVowel {

    public static void main(String[] args) {

        String nm= "Ashish";

        String vowel ="aeiouAEIOU";

        char [] ch=nm.toCharArray();
        int left=0;
        int right=ch.length-1;

        while(left<right){
            if(vowel.indexOf(ch[left])==-1){
                left++;

            } else if (vowel.indexOf(ch[right])==-1) {
                right--;
            }

            else{

                char temp;
                temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                temp++;
                right--;
            }

        }

        System.out.println("Reverse String -->"+new String(ch) );



    }
}
