import java.util.stream.Stream;

public class Arrays {

    public static void main(string_1[] args) {

        String[] names = {"Riya", "Ravi", "Aryan"};
        Stream<String> nameStream = java.util.Arrays.stream(names);
        nameStream.forEach(System.out::println);

        System.out.println(java.util.Arrays.toString(names));


//        int[] scores = {85, 72, 93, 65, 78};
//        IntStream scoreStream = Arrays.stream(scores, 1, 4); // 72, 93, 65
//        scoreStream.forEach(System.out::println);


        int[] nums = {1, 2, 3, 4, 5};
        int[] doubled = java.util.Arrays.stream(nums)
                .map(n -> n * 2)
                .filter(v->v%4==0)
                .toArray(); // [4, 8]

        System.out.println(java.util.Arrays.toString(doubled));


        int[] numList = {1, 2, 3, 4, 5};

        System.out.println(java.util.Arrays.stream(numList).max().getAsInt());
        System.out.println(java.util.Arrays.stream(numList).average().orElse(0.0));



    }
}
