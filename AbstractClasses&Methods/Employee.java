
abstract class Employee{

    String name;
    int id;

    Employee(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    abstract void calculatePay();

    void getEmployeeDetails()
    {
        System.out.println("Name: "+name+"\nID: "+id);
        calculatePay();
    }
}

class HourlyEmployee extends Employee{

    int hourlyWage;

    HourlyEmployee(String name, int id, int hourlyWage)
    {
        super(name, id);
        this.hourlyWage=hourlyWage;
    }
    void calculatePay(){
        System.out.println(hourlyWage);
    }
}

class SalaridEmployee extends Employee{

    int salary;

    SalaridEmployee(String name, int id, int salary)
    {
        super(name, id);
        this.salary=salary;
    }

    void calculatePay(){
        System.out.println(salary);
    }
}
public class Main {
    public static void main(String[] args) {

        Employee e1= new HourlyEmployee("Sundar", 1, 1000);
        Employee e2= new SalaridEmployee("Sundar", 2, 50000);

        e1.getEmployeeDetails();
        e1.calculatePay();

        e2.getEmployeeDetails();
        e2.calculatePay();
        System.out.println("Hello world!");
    }
}