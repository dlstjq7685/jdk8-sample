package com.ysd.classes;

public class animal implements ego{

    private String pat;

    public animal(String p){
        pat = p;
    }

    @Override
    public void pattern() {
        System.out.println(pat);
    }

    public void setPat(String pat) {
        this.pat = pat;
    }
}
