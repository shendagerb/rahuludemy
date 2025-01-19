package org.selenium.demo;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        String []s={"Sagar","Samir","kajal"};

        List<String> s1=Arrays.asList(s);
        System.out.println(s1);

        boolean b=s1.contains("sagar");
        System.out.println(b);

    }




}
