
class Employee{

    String name;
    int id;

    Employee(String name, int id)
    {
        this.id=id;
        this.name=name;
    }
    String getEmployeeDetails(){
        return "Name: "+name+" ID: "+id;
    }
}

class HourlyEmployee extends Employee{

    int hourlyWage;

    HourlyEmployee(String name, int id, int hourlyWage)
    {
        super(name, id);
        this.hourlyWage=hourlyWage;
    }
    String getEmployeeDetails(){
        return super.getEmployeeDetails()+" HourlyWage: "+hourlyWage;
    }
}

class SalariedEmployee extends Employee{
    int salary;

    SalariedEmployee(String name, int id, int salary)
    {
        super(name, id);
        this.salary=salary;
    }
    String getEmployeeDetails(){
        return super.getEmployeeDetails()+" Salary: "+salary;
    }
}
public class Main {
    public static void main(String[] args) {

        Employee e1= new HourlyEmployee("Sundar", 1, 1000);
        Employee e2= new SalariedEmployee("Sundar", 2, 50000);
        System.out.println("Hello world!");
    }
}