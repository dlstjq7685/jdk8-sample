package com.ysd.classes;

public class dog extends animal implements interfaces{
    public dog(String p) {
        super(p);
    }

    @Override
    public void behavior() {
        System.out.println("this dog name is"+this.getPat());

    }

    @Override
    public void say() {
        System.out.println("bak bak");
    }
}
