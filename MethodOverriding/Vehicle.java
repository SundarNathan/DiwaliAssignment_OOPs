
class Vehicle{

    void start(){
        System.out.println("Vehicle is starting");
    }

    void stop(){
        System.out.println("Vehicle is stopping");
    }
}

class car extends Vehicle{

    void start(){
        System.out.println("Car is starting");
    }

    void stop(){
        System.out.println("Car is stopping");
    }
}

class bike extends Vehicle{

    void start(){
        System.out.println("bike is starting");
    }

    void stop(){
        System.out.println("bike is stopping");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}