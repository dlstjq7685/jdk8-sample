package com.ysd.threads;

/*
    What is multi-thread system?
        アプリ中で複数のタスク(機能)を同時に走らせる
        requirement
            同時性(例...セマフォ)

    Why need multi-thread system?
        example
            server accept

 */
public class basic {

    public basic(){
        child c1 = new child();
        child c2 = new child();

        c1.setName("Child 1");
        c2.setName("Child 2");

        c1.run();
        c2.run();

    }
}
