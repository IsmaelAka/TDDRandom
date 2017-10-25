package com.company;

import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);

        double random1 = Math.random();
        double random2 = Math.random();
        double result = random1 + random2;

        if (result >= 1) {
            double atan = (Math.atan(result));

            //System.out.println(random1);
            //System.out.println(random2);
            System.out.println(result);
            System.out.println(atan);


        }
        else {
            System.out.println("Le résultat de l'addition est inférieur à un");
        }

    }
}








