import org.apache.logging.log4j.core.util.JsonUtils;

public class string_2 {


    public static void main(String[] args) {


        // Palindrome
        String orignal="MADAerM";

        StringBuilder sb = new StringBuilder(orignal);

        String rev= sb.reverse().toString();

        if (orignal.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindore");
        }



        // remove special charcter from String

        String input = "Hello@World#2025!";
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(cleaned);  // Output: HelloWorld2025

    }
}
