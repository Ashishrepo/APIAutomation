package Practise_Problems;

public class reverseArray_TwoPointers {

    public static void main(String[] args) {

        String nm= "Ashish";

        char [] cnm= nm.toCharArray();

        int i=0;
        int j=cnm.length-1;

        while(i<j){

            char temp=cnm[i];
            cnm[i]=cnm[j];
            cnm[j]=temp;

            i++;
            j--;

        }

        System.out.println("Reverse Array--> "+new String(cnm));
    }
}
