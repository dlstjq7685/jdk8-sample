package com.ysd.test;

public class Moneys {

    private int value;
    private int count;
    private String name;
    private int sum;


    public Moneys(int pValue,int pCount) {
        this.value = pValue;
        this.count = pCount;
        this.name = "user";

        sumValue();
    }

    public Moneys(int pValue, int pCount, String pName){
        this.value = pValue;
        this.count = pCount;
        this.name = pName;

        sumValue();
    }

    private void sumValue(){
        sum = this.value * this.count;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        this.sumValue();
        return sum;
    }
}
