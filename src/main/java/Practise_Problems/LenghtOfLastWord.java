package Practise_Problems;

public class LenghtOfLastWord {

    public static void main(String[] args) {

        String n= "  Ashish   Jain   ";

//        String [] ar=n.split(" ");
//        System.out.println(ar[ar.length-1].length());


        // method 2 without trim


        char[] sp= n.toCharArray();
        int count =0;
        for(int i=sp.length-1;i>=0;i--){

            if(sp[i]!=' '){
                count++;
            }
            else {
                if(count>0){
                    System.out.println("without Trim "+count);
                    break;
                }

            }
        }


        // With Trim
                n=n.trim();
         char [] t= n.toCharArray();
        int count_new =0;
         for(int j=t.length-1;j>=0;j--){

             if(t[j]==' '){
                 break;
             }else {
                 count_new+=1;
             }



         }
        System.out.println(" With Trim "+count_new);

     }
}
