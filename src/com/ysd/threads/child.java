package com.ysd.threads;

public class child implements Runnable{

    private String name;
    Thread t;

    public child(){
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 5;i++){
                System.out.println(this.name);
                Thread.sleep(999);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
