public class string_1 {

    public static void main(String[] args) {

        String orignalName = "Ashish Jain";

        String rev = "";

        for (int i = orignalName.length() - 1; i >= 0; i--) {
            rev = rev + orignalName.charAt(i);
        }

        System.out.println(rev);


        // reverse only charcters and not words


        String[] splt = orignalName.split(" ");
        String rev_1 = "";
        for (int i=0;i<=splt.length - 1; i++) {
            for (int j = splt[i].length() - 1; j >= 0; j--) {
                rev_1 = rev_1 + splt[i].charAt(j);
            }
            System.out.println(" ");
        }
        System.out.println("***********************");
        System.out.println(rev_1);


        // method 2

        String[] spltChar = orignalName.split(" ");
        String revChar = "";
        for (int i=0;i<=splt.length - 1; i++){

            char [] arr = spltChar[i].toCharArray();
            for(int j=arr.length-1;j>=0;j--){
                revChar=revChar+arr[j];
            }

        }
        System.out.println("$$$$$$$$$$$$$$$$$$$");
        System.out.println(revChar);


        // **********************************************************
        System.out.println("************* String Builder **********************");
        StringBuilder bld = new StringBuilder(orignalName);
        System.out.println(bld.reverse());
        for(int i=0;i<orignalName.length();i++){

            if(orignalName.charAt(i) == 's'){
                bld.setCharAt(i,'S');
            }
       }
        System.out.println(bld);

        //append (<String>) and delete(<startIndex>,<endIndex>)
        //replace(strtIndex, endIndex, newString) and setCharAt(index,char)
        // insert(index,String) and reverse





    }
}
