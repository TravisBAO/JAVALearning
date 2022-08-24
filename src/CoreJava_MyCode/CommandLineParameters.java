package CoreJava_MyCode;

import java.util.Objects;

public class CommandLineParameters {

    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("-h"))
            System.out.println("Hello Java!");
//        else if (args[0] == "-g")
        else if (args[0].equals("-g"))
            System.out.println("Goodbye");
        else
        {
            for (var s : args)
                System.out.println(s);
        }
    }
}
