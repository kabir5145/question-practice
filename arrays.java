import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//    int [] marks = {343,56,738,8679};
//        System.out.println(marks[2]);

        //question 4
//        int [] numbers = {23,-45,67};
//        int sum = 0;
//        for(int i =0; i<numbers.length;i++){
//            sum = sum + numbers[i];
//        }
//        double average = sum / numbers.length;
//        System.out.println("average of the numbers is:"+ average);

        //question 1
//        int [] number = {2,3,3,1};
//        int sum = 0;
//        for(int  i: number){
//            sum += i;
//            System.out.println(sum);
//        }

        //question 2
//        int[][] pattern = new int[5][5];
//        //input
//        for (int i = 0; i < 10; i++) {
//            //output
//            for (int k = 0; k < 10; k++) {
//                System.out.print("-"+ " ");
//            }
//            System.out.println();
//        }

        //question 4
        int [] avg ={12,-34,98} ;
        int sum = 0;
        for(int i = 0;i<avg.length;i++){
            sum = sum +avg[i];
        }
        double result = sum/ avg.length;
        System.out.println(result+" This is the average of three numbers");
        }
    }

