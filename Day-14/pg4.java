import java.util.*;

public class pg4 {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding elements to the ArrayList
        fruits.add("Apple");   // Add "Apple" at the end
        fruits.add("Banana");  // Add "Banana" at the end
        fruits.add("Cherry");  // Add "Cherry" at the end
        fruits.add(1, "Orange"); // Add "Orange" at index 1

        // Display the ArrayList after adding elements
        System.out.println("ArrayList after adding elements: " + fruits);

        // 3. Accessing elements (Get and Set)
        String firstFruit = fruits.get(0); // Get the element at index 0 (Apple)
        System.out.println("First fruit: " + firstFruit);
        
        fruits.set(0, "Grapes"); // Set a new value at index 0 (replace "Apple" with "Grapes")
        System.out.println("ArrayList after setting value: " + fruits);

        // 4. Removing elements
        fruits.remove("Banana"); // Remove by value
        fruits.remove(2);        // Remove by index (removes "Cherry")
        System.out.println("ArrayList after removal: " + fruits);

        // 5. Searching elements
        boolean containsOrange = fruits.contains("Orange");  // Check if "Orange" is in the list
        int indexOfGrapes = fruits.indexOf("Grapes");          // Get index of "Grapes"
        System.out.println("Contains Orange? " + containsOrange);
        System.out.println("Index of Grapes: " + indexOfGrapes);

        // 6. Iterating through the ArrayList
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);  // Prints each element
        }

        // 7. Sorting the ArrayList
        Collections.sort(fruits);  // Sort in alphabetical order
        System.out.println("Sorted ArrayList: " + fruits);

        // 8. Size of the ArrayList
        int size = fruits.size();  // Get the size of the ArrayList
        System.out.println("Size of the ArrayList: " + size);

        // 9. Checking if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // 10. Clearing the ArrayList
        fruits.clear();  // Remove all elements from the ArrayList
        System.out.println("ArrayList after clearing: " + fruits);

        
    }
}


