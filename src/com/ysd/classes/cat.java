package com.ysd.classes;

public class cat extends animal implements interfaces{
    public cat(String p) {
        super(p);
    }

    @Override
    public void behavior() {
        System.out.println("this cat name is"+this.getPat());

    }

    @Override
    public void say() {
        System.out.println("grm..");
    }
}
