

public class cwh_practice_set_6 {
    public static void main(String[] args) {
        // practice problem 1
//        float[] marks = {45,67,57.4f,76.4f};
//        float sum = 0;
//        for (float elements:marks){
//        sum = sum + elements;
//}
//        System.out.println("the value of sum is " + sum );

        //pp2
//        float[] marks = {45, 67, 57.4f, 76.4f};
//        float num = 49f;
//        boolean isInArray = false;
//        for (float elements : marks) {
//            if (num == elements) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("the value is present in the array");
//        } else {
//            System.out.println("the value is not present in array");
//       }

        //pp3
//        float[] marks = {45,67,57.4f,76.4f};
//        float sum = 0;
//        for (float elements:marks){
//        sum = sum + elements;
//}
//        System.out.println("the value of average  is " + sum/marks.length );

        //pp4
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{3,4,5},
                        {3,7,8}};
        int [][] result = {{0,0,0},
                {0,0,0}};

    for (int i =0; i <mat1.length; i++){//row number of times
for (int j=0;j< mat1[i].length;j++){//colum number of time
    System.out.format("setting value for i=%d and j=%d \n" ,i,j);
    result[i][j] =mat1[i][j] + mat2[i][j];

         }
       }
    }
}
