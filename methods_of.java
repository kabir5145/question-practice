
public class methods_of {
        static int logic( int x, int y){
            int z;
                if (x>y){
                    z = ( x + y)/2;
                }
                else {
                    z = (x+ y)/4;
                }
                return z;
            }

    public static void main(String[] args) {
            int a = 1;
            int b = 3;
        int c ;
        c = logic(a, b);
        System.out.println(c);

    }
}



