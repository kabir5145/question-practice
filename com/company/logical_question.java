package com.company;

import java.util.*;

public class logical_question {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int d = 10;

        System.out.print(a + " " + b + " ");
        for(int i = 2;i<d;i++){
            int sum = a+b;
            System.out.print(sum+" ");
            a = b;
            b = sum;
        }
    }
}