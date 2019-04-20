package com.ysd.data;

public class basic {
    //Number
    int num = 1;  //Integer
    float fnum = 5.0f / 3;  //Float
    double dnum = 5.0 / 3;  //Double
    short snum = 32767;  //Short
    long lnum = 9223372036854775807L;  //Long

    //Character
    char c = 'A';  //Character
    String str = "Apple";  //String
    StringBuilder strb = new StringBuilder();  //StringBuilder

    //Other
    boolean flag = true; // Boolean
    byte b = 127; //Byte

    public basic() {
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
    }
}
