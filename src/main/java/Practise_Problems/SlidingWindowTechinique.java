package Practise_Problems;

public class SlidingWindowTechinique {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7};

        // window size
        int k=3;

        //sum of first k window elemenst
       int sum=0;
       for(int i=0;i<k;i++){
           sum+=arr[i];
       }

       int maxSum=sum;

       // slide window to right by one element
       for(int i=1;i<=arr.length-k;i++){
           sum=sum-arr[i-1]+arr[i+k-1];
          maxSum=Math.max(maxSum,sum);
    }

        System.out.println("Max Sum ="+maxSum);

    }
}
