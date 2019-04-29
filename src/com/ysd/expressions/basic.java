package com.ysd.expressions;

public class basic {
    private int num;
    private int num2;

    public basic() {
        //---演算子---
        num = 10 + 5;  //加算
        System.out.println("10 + 5 = " + num);

        num = 10 - 5;  //減算
        System.out.println("10 - 5 = " + num);

        num = 10 * 5;  //乗算
        System.out.println("10 * 5 = " + num);

        num = 10 / 5;  //除算
        System.out.println("10 / 5 = " + num);

        num = 10 % 3;  //余り算
        System.out.println("10 % 3 = " + num);
        System.out.println();

        num = 0;

        num++; //インクリメント
        System.out.println("Increment: "+num);

        num--;//デクリメント
        System.out.println("Decrement: "+num);

        num = 5;
        num2 = 5;
        num = num + 10;
        num2 += 10;
        System.out.println("num:" + num + " num2:" + num2);
        System.out.println();

        //---条件式---
        /*
        ==  同じ値の時true
        !=  異なる値の時true
        >   左辺より右辺が小さい時にtrue
        <   左辺より右辺が大きい時にtrue
        >=  左辺より右辺が小さい時と同じ値の時にtrue
        <=  左辺より右辺が大きい時と同じ値の時にtrue
        &&  左辺と右辺がtrueのときtrue
        ||  左辺か右辺がtrueのときtrue
        !   trueとfalseを反転させる
        */

        //---制御文---
        //if
        System.out.println("if:");
        if (10 > 5) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        num = 1;
        System.out.print("num is ");
        if (num < 0) {
            System.out.println("-");
        } else if (num == 0) {
            System.out.println("0");
        } else {
            System.out.println("+");
        }
        System.out.println();

        //switch
        System.out.println("switch:");
        int mode = 2;
        switch (mode) {
            case 1:
                System.out.println("Mode:1");
                break;
            case 2:
                System.out.println("Mode:2");
                break;
            case 3:
                System.out.println("Mode:3");
                break;
        }
        System.out.println();

        //while
        System.out.println("while:");
        num = 0;
        while (num != 5) {
            System.out.println(num);
            num++;
        }
        System.out.println();

        //for
        System.out.println("for:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
