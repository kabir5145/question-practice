package com.company;


import java.util.Scanner;

public class function_question {
public static void calculator(double n , double m){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    m = sc.nextDouble();
    System.out.println("Enter the second number:");
    n = sc.nextDouble();
    System.out.println("Enter the operator which you want to use are +,-,*,/:");
    char operator  = sc.next().charAt(0);
    double result = calculate(m, n, operator);
    System.out.println(result);
    }

    public static double calculate(double m, double n, char operator) {
        return switch (operator) {
            case '+' -> m + n;
            case '-' -> m - n;
            case '*' -> m * n;
            case '/' -> {

                if(n==0.0) {
                    throw new RuntimeException("error");
                }
                yield m/n;
            }
            default -> throw new RuntimeException("Invalid operator");
        };
    }

    public static void main(String[] args) {
    calculator(2,3);

    }
}
