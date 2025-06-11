package Practise_Problems;

public class prac {

    public static void main(String[] args) {

       int [] ar={0,1,4,6,10,45};
       int target=16;

       if(checkSum(ar,target)){
           System.out.println("true");
       }else {
           System.out.println(false);
       }
    }


    public static boolean checkSum(int[]n,int target){

          for(int i=0;i<n.length;i++){

            for(int j=i+1;j<n.length;j++){

                if(n[i]+n[j]==target){
                    System.out.println("Pairs found->"+n[i]+" ,"+n[j]);
                    return true;
                }
            }
        }

   return  false;
    }
}
