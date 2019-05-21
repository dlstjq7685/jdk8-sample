package com.ysd.threads;

import com.ysd.start;

/*
    reference: https://www.ibm.com/developerworks/jp/java/library/j-jtp06197.html

    What is multi-thread system?
        アプリ中で複数のタスク(機能)を同時に走らせる
        requirement
            同時性(例...セマフォ)

    Why need multi-thread system?
        example
            server accept

    multi-thread 原則
        state 変数をpublicにしないこと
        state 変数をimmutableにしてpublicにするまた
        synchronization methodで接近する

 */
public class basic implements start {

    @Override
    public void run() {

        Table t = new Table();

        child c1 = new child(t);
        child c2 = new child(t);

        c1.setName("Child 1");
        c2.setName("Child 2");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
