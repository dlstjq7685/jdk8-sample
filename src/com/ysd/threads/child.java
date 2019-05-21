package com.ysd.threads;

public class child implements Runnable{

    private String name;
    private int counter;
    private Table t;

    {
        counter = 0;
    }

    child(Table t){
        t = t;
    }

    @Override
    public void run() {
        System.out.println(name);
        t.printTable(5);
    }

    @NotThreadSafe
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

}
