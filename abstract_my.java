

abstract class book{
    public book(){
        System.out.println("the name of the movies are:");
    }
    public void bookName(){
        System.out.println("the name of  the book is :");
        System.out.println("flamingo");
    }
    abstract public void film1();
    abstract public void film2();
}
class movie extends book{

    @Override
    public void film1() {
        System.out.print("interstellar");
    }

    @Override
    public void film2() {
        System.out.println(" and inception");
    }
}
public class abstract_my {
    public static void main(String[] args) {
        movie m = new movie();
        m.film1();
        m.film2();
        m.bookName();

    }
}
