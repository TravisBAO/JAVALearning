public class demoo {
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
