package TABLES;

public class c1 {

    public static void main(String[] args) {

        String s= "showing(1909 Pages)";

        int startIndex= s.indexOf("(")+1;
        int endIndex=s.indexOf("Pages")-1;


        System.out.println(s.substring(startIndex,endIndex));
    }
}
