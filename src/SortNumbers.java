import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};

        System.out.println("Usorteret array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println(); // for udprintes skyld så hver talrække kommer på hver deres linje

        Arrays.sort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
