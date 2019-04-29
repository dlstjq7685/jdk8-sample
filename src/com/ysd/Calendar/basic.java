package com.ysd.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class basic {

    public basic(){

        System.out.println("Calender-test");

        //JDK version 211 over
        String date =  new SimpleDateFormat("GGGGyyyy年M月d日", Locale.forLanguageTag("ja-JP-u-ca-japanese")).
                format(new Calendar.Builder().
                        setDate(2019, Calendar.MAY, 1).build().getTime());

        System.out.println(date);

        String current =  new SimpleDateFormat("GGGGyyyy年M月d日", Locale.forLanguageTag("ja-JP-u-ca-japanese")).
                format(Calendar.getInstance().getTime());

        System.out.println(current);

    }
}
