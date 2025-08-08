import java.util.Arrays;

public class Arrays_1 {

    public static void main(String[] args) {

        String[] mail1 = {"ashish@gmail.com","ayush@gmail.com","zen@gmail.com"};

        for(String m:mail1){

//            System.out.println(m.substring(0,m.indexOf('@')));
        }
        

        String d= "abc&xyz";

        String[] x=d.split("&");

        System.out.println(x);
        System.out.println(Arrays.toString(x));

    }
}
