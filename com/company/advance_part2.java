package com.company;

import java.util.LinkedList;

public class advance_part2 {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.addFirst(456);
        li.add(10);
        li.add(11);
        li.add(12);
//        li.offer(0);
        li.add(13);
        li.add(14);
        li.add(15);
        li.addLast(2376);
//        li.set(0,12);
//        System.out.println( li.indexOf(1));
        System.out.println(li);
    }
}
