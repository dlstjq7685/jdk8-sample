package com.ysd.sysInOut;

import com.ysd.start;

import java.util.Scanner;

public class basic implements start {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input:");

        String input = scanner.nextLine();

        System.out.println(input);
        scanner.close();

    }
}
