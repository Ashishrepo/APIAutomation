package Practise_Problems;

public class Pangram_String {

    public static void main(String[] args) {

        String input="abcd efgh ijklmnopqrstuvw xyz";
        boolean result=checkPangram(input);
        System.out.println(result);

    }

    private static boolean checkPangram(String input) {

        // string lenght should be greater than 26
        if(input.length()<26){
            return false;
        }

//  check if string contains all 26 characters
        for(char i='a';i<='z';i++){
           if(input.indexOf(i)<0){
               return false;
           }

        }

        return true;
    }
}
