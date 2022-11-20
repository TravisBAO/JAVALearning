package CoreJava_MyCode.v1ch05.abstractClasses;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

import java.time.LocalDate;

public class Employee extends Person
{
    private double salary;
    private LocalDate hireDay;

    public Employee (String name, double salary, int year, int month, int day)
    {
        super(name); // shorthand for "call the constructor of the Employee superclass with name as parameter"
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary()
    {
        return this.salary;
    }

    public LocalDate getHireDay()
    {
        return this.hireDay;
    }

    public String getDescription()
    {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent)
    {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
