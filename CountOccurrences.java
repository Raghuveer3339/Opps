import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }

        System.out.println("The number " + target + " appears " + count + " times in the array.");
        scanner.close();
    }
}
