package CoreJava_MyCode.v1ch06.interfaces;

public class Employee implements Comparable<Employee>
{
    private String name;
    private double salary;

    public Employee (String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return this.name;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public void raiseSalary (double byPercent)
    {
        double raise = this.salary * byPercent / 100;
        salary += raise;
    }

    public int compareTo(Employee other)
    {
        return Double.compare(salary, other.salary);
    }
}
