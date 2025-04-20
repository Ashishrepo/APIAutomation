package Streams_Selenium;

import java.util.Arrays;
import java.util.List;

public class Stream_Map {

    public static void main(String[] args){

        List<String> ls= Arrays.asList("Ashish","Ayush","lakshit");

        String d = ls.stream().filter(x -> "Ashish".equals(x)).findAny().orElse(null);
        System.out.println(d);


        ls.stream().filter(x -> "Ashish".equals(x)).map(x->x.length()).findAny().orElse(null);


    }
}
