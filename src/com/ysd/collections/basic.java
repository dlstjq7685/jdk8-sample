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
    }
}
