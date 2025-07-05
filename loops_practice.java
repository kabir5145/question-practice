
import java.util.Scanner;

public class loops_practice {
    public static void main(String[] args) {

        //practice problem 1
//        int n=4;
//        for(int i= n;i>0;i--){
//            for(int j=0;j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        //practice problem 2
//        int sum = 0;
//        int n =3;
//        for (int i=0;i<n;i++){
//            sum= sum +(2*i);
//        }
//        System.out.print("sum of even number is :");
//        System.out.println(sum);

        //practice problem 3
//        Scanner s =new Scanner(System.in);
//        int num;
//        System.out.println("enter the number");
//        num = s.nextInt();
//        for(int i = 1; i<=10; i++) {
//            System.out.println(num +"*"+i+"="+(num*i));
//        }

        //practice 4
//        Scanner s =new Scanner(System.in);
//        int num;
//        System.out.println("enter the number");
//        num = s.nextInt();
//        for(int i = 10; i>=1; i--) {
//            System.out.println(num + "*" + i + "=" + (num * i));
//        }

        //practice 5

        int n = 5;
        //5! = 5*4*3*2*1

        int i=1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}


