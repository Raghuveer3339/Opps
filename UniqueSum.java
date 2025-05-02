import java.util.*;

public class UniqueSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 3, 8, 2, 5));

        HashSet<Integer> uniqueSet = new HashSet<>(list);

        int sum = 0;
        for (int num : uniqueSet) {
            sum += num;
        }

        System.out.println("Unique values: " + uniqueSet);
        System.out.println("Sum: " + sum);
    }
}
