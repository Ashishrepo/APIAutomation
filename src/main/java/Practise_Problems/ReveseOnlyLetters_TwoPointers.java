package Practise_Problems;

public class ReveseOnlyLetters_TwoPointers {

    public static void main(String[] args) {

        String n ="1a7n7u";

        char [] ch = n.toCharArray();
        int left =0;
        int right = ch.length-1;

        while(left<right){

            if(!Character.isLetter(ch[left])){
                left++;
            }
            else if (!Character.isLetter(ch[right])) {

                right--;

            }
            else{
                char temp;
                temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }

        System.out.println("Reverse String -> "+new String(ch));

    }
}
