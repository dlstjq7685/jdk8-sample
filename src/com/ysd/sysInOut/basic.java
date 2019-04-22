package com.ysd.sysInOut;

import java.util.Scanner;

public class basic {
    public basic(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input:");

        String input = scanner.nextLine();

        System.out.println(input);
        scanner.close();
    }
}
