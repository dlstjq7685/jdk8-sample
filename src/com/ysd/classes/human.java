package com.ysd.classes;

public class human extends animal implements interfaces{

    public human(String p) {
        super(p);
    }

    @Override
    public void behavior() {
        System.out.println("this human name is"+this.getPat());
    }

    @Override
    public void say() {
        System.out.println(this.getPat() + " is running field");
    }
}
