
/*
class Person{

    private String name = "kabir" ;
    private int age = 18;

    public Person() {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name ;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name ){
        this.name = name ;
    }
    public void setAge(int age ){
        this.age= age;
    }
     */
     class app{
        int  id ;
        String name ;
        String information ;
        int salary;
    }
    class ageUser{
         int age;
    }

public class Main {
    public static void main(String[] args) {
//        Person myPerson = new Person();
//        System.out.println("kabir is "+myPerson.getAge()+" years old.");
//        System.out.println(myPerson.getName());
        app a = new app();
        a.id= 7689;
        a.name = "Instagram";
        a.information ="ka_bir5145";
        a.salary =4500;
        System.out.println("password of my id is : "+a.id);
        System.out.println("Name of the app is : "+a.name);
        System.out.println("User name id is : "+ a.information);
        System.out.println("Salary made from this app is : "+a.salary);

        ageUser b = new ageUser();
        b.age =18;

        if(b.age>=18){
            System.out.println("you can use the app!");
        }
        else {
            System.out.println("you cannot use this app!");
        }

    }
}



