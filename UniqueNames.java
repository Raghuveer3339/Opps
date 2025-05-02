import java.util.*;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList(names));

        // Check if "Sourabh" exists
        if (uniqueNames.contains("Sourabh")) {
            System.out.println("Sourabh is present in the set.");
        }

        // Print unique names
        System.out.println("Unique Names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
