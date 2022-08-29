package CoreJava_MyCode;

public class testStaticField {

    public static void main(String[] args) {
        Employee Harry = new Employee("Harry");
        Harry.setId();

        Employee Travis = new Employee("Travis");
        Travis.setId();
    }
}

class Employee{
    private int id;
    private String name;
    private static int nextId = 1;

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
}
