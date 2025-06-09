package Practise_Problems;

import java.util.Arrays;

public class MoveAllZeroATEnd {

    public static void main(String[] args) {

        // two pointers technique

        int [] a={1,0,2,0,-1,0};
        int temp=0;
        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i]==0 && a[j]!=0){
                    a[i]=a[j];
                    a[j]=0;
                }

            }
        }

        System.out.println("New Array ->"+Arrays.toString(a));
    }

}
