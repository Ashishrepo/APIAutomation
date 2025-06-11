package Practise_Problems;

public class RemoveSpecialChr {

    public static void main(String[] args) {

        String org= "Ash@h#$Jain";

        StringBuilder newStr = new StringBuilder();

        for(int i=0;i<org.length();i++){

            if(Character.isLetter(org.charAt(i))){
                newStr.append(org.charAt(i));

            }
        }

        System.out.println("New String --> "+ newStr);

    }
}
