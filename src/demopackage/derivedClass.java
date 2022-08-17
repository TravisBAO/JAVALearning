package demopackage;

public class derivedClass extends BaseClass {

    public void JustPrint()
    {
        super.JustPrint();
        System.out.println("This is the text from derivedclass");
    }
}

class fdsfds{
    public static void main(String[] args) {


        derivedClass dc = new derivedClass();
        dc.JustPrint();

    }
}
