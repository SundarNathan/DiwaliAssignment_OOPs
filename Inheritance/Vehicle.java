class Vehicle{
    String engineVersion;
    int generation;
}

class bike extends Vehicle{
    String type;
}

class car extends Vehicle{
    int seatingCapacity;

}

class truck extends Vehicle{
    int loadCapacity;

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}