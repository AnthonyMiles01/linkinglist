package com.company;

import sun.awt.SunToolkit;
import sun.security.util.Length;

public class Main {

    public static void main(String[] args) {
//        node node1 = new node (132);
//        node node2 = new node (321);
//        node node3 = new node (123);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = null;
//
//        node run = node1;
//        while(run!= null){
//            System.out.println(run.value);
//            run = run.next;
//        }
        LinkingList<Integer> list = new LinkingList();
        for(int i =0; i< 20; i++){
            list.add(i);
        }


        list.trace();
        System.out.println(list.length());
    }
}