package com.ysd.collections;

import java.util.*;

public class basic {

    /*
        HashSet
            - 配列型
            - 格納値が重複不可
            - 並び順序は保証しない
            - 処理速度が速い
        TreeSet
            - 重複値使用不可
            - 並び順序を保証する
        LinkedHashSet
            - 重複値格納不可

        LinkedHashMap
            - キーと値を格納する
            - キーは重複不可、値は重複可能
        ArrayDeque
            - 先頭、末尾から変数の出したり入れたり可能
        ArrayList
        LinkedList
        HashMap
        TreeMap
     */
    private HashSet hs;
    private TreeSet ts;
    private LinkedHashSet lhs;
    private ArrayList al;
    private LinkedList ll;
    private ArrayDeque ad;
    private HashMap hm;
    private TreeMap tm;
    private LinkedHashMap lhm;

    public basic(){
        hs = new HashSet();
        ts = new TreeSet();
        lhs = new LinkedHashSet();
        al = new ArrayList();
        ll = new LinkedList();
        ad = new ArrayDeque();
        hm = new HashMap();
        tm = new TreeMap();
        lhm = new LinkedHashMap();

        Set<String> color = new HashSet<>();

        color.add("red");
        color.add("yellow");
        color.add("blue");

        color.forEach(c -> System.out.println(c));

        //Auto sort
        Set<Integer> num = new TreeSet<>();
        num.add(3);
        num.add(1);
        num.add(10);

        num.forEach(n -> System.out.println(n));

        Map<String,String> ani = new HashMap<>();
        ani.put("jojo","jotaro");
        ani.put("monogatari","shinobu");
        ani.put("gundam","amuro");

        System.out.println(ani);

        List<String> names = new LinkedList<>();

        names.add("dio");
        names.add("SPW");
        names.add("jonadan");

        System.out.println(names);

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.offer(6);

        System.out.println(stack);
        System.out.println(stack.pop());

        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println(stack);
        System.out.println(stack.poll());

        System.out.println(stack);
    }
}
