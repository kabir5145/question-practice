package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class function_question {
    public static void main(String[] args) {
        int []arr ={12,43,565,2,21,43};
        System.out.println("The given array is: "+ Arrays.toString(arr));

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            } else if (num==secondLargest) {
                System.out.println("There are two common second largest words in an array");
            }
        }
        System.out.println("The second largest number is : "+secondLargest);
    }
}
