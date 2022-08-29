package CoreJava_MyCode;

import java.util.Arrays;

public class LotteryDrawing {

    public static void main(String[] args) {
        int n = 49; // total number
        int k = 6; // drawing number
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++){
            // Math.random method returns a random floating point number than is between 0(inclusive) and 1(exclusive).
            // By multiplying the result with n, we obtain a random number between 0 and n-1.
            int r = (int)(Math.random() * n);
            result[i] = numbers[r];
            // move the last element into the random location
            numbers[r] = numbers[n - 1];
            n--;
            System.out.println("now the length of numbers is " + n);
            for(int x : numbers)
                System.out.print(x + ",");
            System.out.print("\n");
        }

        // print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for(int r : result)
            System.out.println(r);
    }
}
