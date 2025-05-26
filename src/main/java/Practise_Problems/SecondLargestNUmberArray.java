package Practise_Problems;

public class SecondLargestNUmberArray {



    public static void main(String[] args) {

        int [] ar ={-1,-3,-2,-4,-6,-9};
        int largest=Integer.MIN_VALUE;
        int secondLarget=Integer.MIN_VALUE;

        for(int n:ar){

            if(n>largest){

                secondLarget=largest;
                largest=n;
            } else if (n >secondLarget && n!=largest) {

                secondLarget=n;

            }

        }

        System.out.println("Largest "+largest);
        System.out.println("Second_Largest "+secondLarget);

    }
}
