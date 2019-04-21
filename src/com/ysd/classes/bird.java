package com.ysd.classes;

public class bird extends animal implements interfaces{

    public bird(String p) {
        super(p);
    }

    @Override
    public void behavior() {
        System.out.println("this bird is"+this.getPat());
    }

    @Override
    public void say() {
        System.out.println("fly to the sky");
    }
}
