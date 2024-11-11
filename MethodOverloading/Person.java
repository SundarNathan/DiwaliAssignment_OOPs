
class Person{
    String name, address;
    int age;

    Person(String name){
        this.name=name;
    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    void display(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nAddress: "+address);
    }
}
public class Main {
    public static void main(String[] args) {
        Person p1= new Person("Sundar");
        Person p2= new Person("Sundar", 23);
        Person p3= new Person("Sundar", 23, "Chennai");

        p1.display();
        p2.display();
        p3.display();
    }
}