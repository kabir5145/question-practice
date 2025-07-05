
/*
class circle {
    public int radius;

    circle(int r){
        this.radius= r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle{

    cylinder1(int r,int h) {
        super(r);
        this.height=h;
    }
    public int height;
    public double vol(){
        return Math.PI*this.radius*this.radius*this.radius;
    }
}
 */
class rectangle{
    public int length;
    public int breadth;
    public int height;

    rectangle(int l,int b,int h){
        this.length=l;
        this.breadth=b;
        this.height=h;
    }

    rectangle() {
    }

    public double area(){
        return length*breadth*height;
    }
}
class cuboid extends rectangle{
    public int area;
    cuboid(int a ){
        this.area=a;
    }

    public double vol(){
        return area*area*area;
    }
}
public class question {
    public static void main(String[] args) {
        /*
        question 1,3
        System.out.println("the area of the circle is :");
        circle c = new circle(12);
        System.out.println(c.area());
        System.out.println("the volume of the cylinder is:");
        cylinder1 s = new cylinder1(12,2);
        System.out.println(s.vol());

       }
         */
        //question 2
        System.out.println("area of the rectangle is :");
        rectangle v = new rectangle(2,3,1);
        System.out.println(v.area());
        System.out.println("volume of the cuboid is:");
        cuboid cs = new cuboid(2);
        System.out.println(cs.vol());



    }
}