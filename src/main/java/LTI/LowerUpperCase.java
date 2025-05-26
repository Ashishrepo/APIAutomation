package LTI;

public class LowerUpperCase {

    public static void main(String[] args) {

        String name= "AsHiSh JAIn";

        char [] n=name.toCharArray();

        // Solution 1
//        for(Character c:n){
//
//            if(Character.isUpperCase(c)){
//                System.out.print(c.toString().toLowerCase());
//            }else{
//                System.out.print(c.toString().toUpperCase());
//            }
//
//        }



          String input = " Ashish JAIN";
          StringBuilder result = new StringBuilder();
          char[] data=input.toCharArray();

          for(char c:data){

              if(Character.isUpperCase(c)){
                  result.append(Character.toLowerCase(c));
              } else if (Character.isLowerCase(c)) {
                  result.append(Character.toUpperCase(c));
              }else {
                  result.append(c);
              }

          }

        System.out.println("Orignal String: "+input);
        System.out.println("New String: "+result);



    }
}
