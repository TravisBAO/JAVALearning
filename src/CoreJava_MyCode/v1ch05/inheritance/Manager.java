package CoreJava_MyCode.v1ch05.inheritance;

import CoreJava_MyCode.v1ch05.inheritance.Employee;

public class Manager extends Employee
{
    private double bonus;

    /*
    * @param name the employee's name
    * @param salary the salary
    * @param year the hire year
    * @param month the hire month
    * @param day the hire day
    */
    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;
    }

    public void setBonus(double b)
    {
        this.bonus = b;
    }
}
