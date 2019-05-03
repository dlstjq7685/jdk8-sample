package com.ysd.data;

import com.ysd.start;

public class basic implements start{

    //Number
    private int num;  //Integer
    private float fnum;  //Float
    private double dnum;  //Double
    private short snum;  //Short
    private long lnum;  //Long

    //Character
    private char c;  //Character
    private String str;  //String
    private StringBuilder strb;  //StringBuilder

    //Other
    private boolean flag; // Boolean
    private byte b; //Byte

    //Non Primitive
    private Integer intObject;

    public basic() {
        num = 1;
        fnum = 5.0f / 3;
        dnum = 5.0 / 3;
        snum = 32767;
        lnum = 9223372036854775807L;
        c = 'A';
        str = "Apple";
        strb = new StringBuilder();
        flag = true;
        b = 127;
        intObject = 10;
    }

    @Override
    public void run() {
        //Number
        System.out.println("Integer: " + num);
        System.out.println("Float: " + fnum);
        System.out.println("Double: " + dnum);
        System.out.println("Short: " + snum);
        System.out.println("Long: " + lnum);
        System.out.println();

        //Character
        System.out.println("Character: " + c);
        System.out.println("String: " + str);

        strb.append("StringBuilder:\n");
        for(int i = 0; i < 5; i++) {
            strb.append("  Count: " + i + "\n" );
        }
        System.out.print(new String(strb));
        System.out.println();

        //Other
        System.out.print("Boolean: ");
        if(flag){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        System.out.println("Byte: "+ b);
        System.out.println();

        //Non Primitive
        System.out.println("Integer:");
        System.out.println(intObject.doubleValue());
        String input = "1024";
        int intNum = Integer.parseInt(input);
        System.out.println(intNum*4);
        System.out.println(Integer.MAX_VALUE);

    }
}