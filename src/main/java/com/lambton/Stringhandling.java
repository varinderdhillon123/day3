package com.lambton;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class Stringhandling {


    public static void main(String[] args)
    {
      /*  String pattern = "###,###,##,00";
        DecimalFormat decimalformat = new DecimalFormat();
        decimalformat.applyPattern(pattern);
        int value = 12345678;
        String output = decimalformat.format(value);
        System.out.println(value + " " + pattern + " " +output);



        System.out.println(LocalDateTime.now());

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));*/

        String s = "1998/01/10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate now1 = LocalDate.now();
        Period diff1 = Period.between(l1, now1);
        System.out.println("age:" + diff1.getYears() + "years");



/*
        String s1 = "hello";
        String s2 = "hello";
        String s3 = null;
        String s4 = new String("hello");*/



    /*if(s1 == s2)
    {
        System.out.println("s1 == s2");

    }else
    {
        System.out.println(s1!= s2);
    }

    if (s3 == s2)
    {
        System.out.println("s3 == s2");
    }else
    {
        System.out.println("s3 != s2)";
    }
    if (s1 == s4)
    {
        System.out.println(" s1 == s4");

    }else
    {
        System.out.println(" s1 != s4");
    }


        System.out.println(s1);
        s1=s2.toLowerCase();
        System.out.println(s1);
        s3=s1.toUpperCase();
        System.out.println(s1);*/

       /* String collegeName = "Lambton College in Toronto";
        int s5;
        s5 = collegeName.length();
        System.out.println(s5);

        boolean b = collegeName.contains("College");
        System.out.println(b);

        s5 = collegeName.indexOf(collegeName);
        System.out.println(s5);

        int a[] = {1, 2, 3, 4, 5,};
        int d[] = new int[]{6, 7, 8, 9,};
        int c[] = new int[3];
        c[0] = 200;
        c[1] = 100;
        c[2] = 300;

        char r[] = collegeName.toCharArray();
        char rev[] = new char[r.length];
        int cnt = 0;
        for (int i = r.length - 1; i >= 0; i--) {
            rev[cnt++] = r[i];
        }
        String reverseString = new String(rev);
        System.out.println("Reverse String = " + reverseString);

        String[] strings = collegeName.split("");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strings.length; i++)
        {
            String rev1 = strings[i];
            if (i % 2 ==1)
            {
                rev1 = reverse(rev1);
            }
            stringBuffer.append(rev1);
            stringBuffer.append("");

        }
        System.out.println("args=" + stringBuffer.toString());
        StringTokenizer stringTokenizer = new StringTokenizer(collegeName, " ");
        while (stringTokenizer.hasMoreElements()) {
            System.out.println("TOKEN : " + stringTokenizer.nextToken());
        }
    }





    static String reverse(String str)
    {
        if(str==null)
        {
            return new String();
        }
        char c[]=str.toCharArray();
        char rev[] = new char[c.length];
        int count=0;
        for(int i=c.length-1;i>=0; i--)
        {
            rev[count++]=c[i];
        }
        return new String(rev);*/
    }


    }
