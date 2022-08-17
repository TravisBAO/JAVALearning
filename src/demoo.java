public class demoo {
    public static void main(String[] args) {

        String testString = "This       is a test string";
        String reversedString = "";
        String[] wordArrayPlus = testString.split(" +");
        String[] wordArrayQuestion = testString.split(" ?");
        String[] wordArrayStar = testString.split(" *");

       for (String eachWord : wordArrayPlus)
       {
           reversedString = eachWord + " " + reversedString;
       }
        System.out.println(reversedString);
        System.out.println();

    }
}
