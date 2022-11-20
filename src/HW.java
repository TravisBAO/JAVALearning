import java.util.Arrays;

public class HW {

    public static void main(String[] args)
    {
        int[] myIntArray = new int[3];
        int[] mySecondArray = new int[]{12,13,23};


        System.out.print(Arrays.toString(myIntArray));
        System.out.println("\n");
        System.out.print(Arrays.toString(myIntArray));
        System.out.println("\n");
        System.out.println(mySecondArray);
        System.out.println("\n");
        for (int i : mySecondArray)
        {
            System.out.println("print every item in mySecondArray " + i);
        }

//        System.out.println("Hello baoyi");
        System.out.print("hello baoyi again！");
    }
}

