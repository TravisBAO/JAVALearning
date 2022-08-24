public class demoo {
    static final int b = 10;
    static final int a = b * 10 ;

    public void demo_static()
    {
//        System.out.println(TIME_DELAY + "from not main function");
    }
    public static void main(String[] args) {

        String testString = "This       is a test string";
        StringBuilder reversedString = new StringBuilder();
        String[] wordArrayPlus = testString.split(" +");

        for (String eachWord : wordArrayPlus)
       {
           reversedString.insert(0, eachWord + " ");
       }
        System.out.println(reversedString);
        System.out.println();

    }
}
