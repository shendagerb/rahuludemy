package org.selenium.demo;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemoClass {
    public static void main(String[] args) {

        Date date=new Date();
        System.out.println(date.toString());
        SimpleDateFormat s=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        System.out.println(s.format(date));

        String s1=s.format(date);
        System.out.println(s1);
        Calendar d=Calendar.getInstance();
        System.out.println(d.get(Calendar.DATE));









    }





}
