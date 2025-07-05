package com.company;
import java.util.Scanner;


public class practice_set {
    public static void main(String[] args) {

        //question 4
        int [] marks = new int[3];
          marks[0]= 8;
          marks[1]=80;
          marks[2]=6;
          boolean flag = true;
          Scanner sc = new Scanner(System.in);
          int index;
          int i =0;
          index =sc.nextInt();
          if(index <5){
              System.out.println("ok");
          }
          else {
              System.out.println("not okay");
          }
        //question 3
//        int [] marks = new int[3];
//        marks[0]= 8;
//        marks[1]=80;
//        marks[2]=6;
//        boolean flag = true;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i =0;
//        while (flag && i<5){
//            index = sc.nextInt();
//            try{
//                System.out.println("the marks in the index is = "+marks[index]);
//                break;
//            } catch (Exception e) {
//                System.out.println("Index invalid");
//            i++;
//            }
//        }
        //question 2
//        try{
//            int a = 10;
//            int b = 0;
//            int c = a/b;
//        }catch (ArithmeticException e ){
//            System.out.println("HAHA");
//        }catch (IllegalArgumentException g ){
//            System.out.println("HEHE");
//        }
        //question 1
        //SYNTAX ERROR DEMO
        //int a =0 // ERROR : no semicolon!
        // b = 8; //ERROR: b not declared!

        //LOGICAL ERROR DEMO
        //write a program to print all prime numbers between 1 and  10
//        System.out.println(2);
//        for (int i = 1;i<5;i++){
//            System.out.println(2*i+1);
//        }
//
//        //RUN TIME ERROR
//        int k;
//        Scanner sc = new Scanner(System.in);
//        k= sc.nextInt();
//        System.out.println("Integer part of 1000 divided by k is = "+1000/k);
    }
}

