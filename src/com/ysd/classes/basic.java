package com.ysd.classes;

public class basic {

    public basic(){
        bird b = new bird("tori");
        cat c = new cat("kuroneko");
        dog d = new dog("siba");
        human h = new human("jojo");

        /*
        abstract description
         */
        b.behavior();
        c.behavior();
        d.behavior();
        h.behavior();

        interfaces bi = b;
        interfaces ci = c;
        interfaces di = d;
        interfaces h1 = h;

        /*
        interface description
            interface is capsule class

         */
        bi.say();
        ci.say();
        di.say();
        h1.say();

    }
}
