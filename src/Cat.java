public class Cat {
    public Cat(String name){
        this.name = name;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

/*
Cat c1 = new Cat("XXX");
Cat c2 = new Cat("XXX");
System.out.println(c1.equals(c2));*/
