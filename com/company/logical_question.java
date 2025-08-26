package com.company;

import java.util.*;

public class logical_question {
    public static void main(String[] args) {
        //reversing a string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println("Reversed string is : "+sb);
    }
}