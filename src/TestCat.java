public class TestCat {

    public static void main(String[] args) {
        Cat c1 = new Cat("XXX");
        Cat c2 = new Cat("XXX");
        System.out.println(c1.equals(c2));

        String s1 = new String("xxx");

        int i1 = 10;
        int i2 = 10;
        System.out.println(" if int variables are equal ---> " + (i1 == i2));
    }
}
