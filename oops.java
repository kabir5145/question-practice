


class cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double  surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
public class oops {
    public static void main(String[] args) {

        //problem 1
        cylinder myCylinder = new cylinder();
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(9);
        int x = myCylinder.getRadius();
        System.out.println(x);

        //problem 2
        System.out.println(myCylinder.surfaceArea());

        //problem 3
        System.out.println(myCylinder.volume());


    }
}
