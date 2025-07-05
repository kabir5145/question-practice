package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class advance_part_1 {
    public static void main(String[] args) {
        ArrayList<Integer> kabir = new ArrayList<>();

        kabir.add(1);
        kabir.add(2);
        kabir.add(3);
        kabir.add(4);
        kabir.add(5);
        //System.out.println(kabir.listIterator());
        //System.out.println(kabir.remove(0));
        //kabir.remove();
        kabir.subList(1,1);
        for(int i = 0;i<kabir.size();i++) {
            System.out.print(kabir.get(i));
            System.out.print(", ");
        }
    }
}
