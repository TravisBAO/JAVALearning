package CoreJava_MyCode;

public class testStaticField {

    public static void main(String[] args) {
        Employee Harry = new Employee("Harry");
        Harry.setId();

        Employee Travis = new Employee("Travis");
        Travis.setId();

        Manager Monica = new Manager();
        Monica.getSalary();
    }
}

class Employee{
    private int id;
    private String name;
    private static int nextId = 1;
    private double salary = 1.0;

    public Employee(){

    }
    public Employee(String n)
    {
        this.name = n;
    }
    public void setId()
    {
        this.id = nextId;
        nextId++;
        System.out.println("In class" + this.name + "The current nextId is " + nextId);
    }
    public double getSalary()
    {
        return this.salary;
    }
}

class Manager extends Employee
{
    private double bonus;

    public Manager()
    {
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;
    }
}
