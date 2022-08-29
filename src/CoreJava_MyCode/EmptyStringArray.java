package CoreJava_MyCode;

public class EmptyStringArray {
    public static void main(String[] args) {

        String[] NullStringArray = new String[3];
        for (String s : NullStringArray) {
            System.out.println(s); // output is null
        }
        System.out.println("================================================");
        for (var s:
             NullStringArray) {
            System.out.println(s); // output is null
        }
    }
}
