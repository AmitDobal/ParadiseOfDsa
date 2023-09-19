package algo.sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Define your custom list class (replace MyCustomList with your actual class)
class MyCustomList<T> {
    private List<T> list = new ArrayList<>();

    // Implement necessary methods for your custom list, e.g., add, get, and remove.

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public int size() {
        return list.size();
    }
}

public class Rough2 {
    public static void main(String[] args) {
        // Sample custom list (replace MyCustomList with your actual class)
        MyCustomList customList = new MyCustomList();
        customList.add("A");//0
        customList.add("B");//1
        customList.add("C");//2
        customList.add("D");//3
        customList.add("E");//4
        
        MyCustomList customList2 = new MyCustomList();
        customList2.add(42);//0
        customList2.add(14);//1
        customList2.add(23);//2
        customList2.add(1);//3
        customList2.add(5);//4
        customList2.add(12);//5

        // Indices to remove
        int[] indicesToRemove = {1,3};

        // Use Java Streams to filter elements based on indices and remove them in place
//        IntStream.range(0, indicesToRemove.length)
//                .forEach(i -> customList.remove(indicesToRemove[i]));
//        Arrays.stream(indicesToRemove)
//        .filter(index -> index >= 0 && index < customList.size()) // Check if the index is within range
//        .forEach(customList::remove); // Remove the elements in place
        
        Arrays.stream(indicesToRemove)
        .boxed() // Convert to Integer objects for sorting
        .sorted((a, b) -> b.compareTo(a))
//        .filter(index -> index >= 0 && index < customList.size()) // Check if the index is within range
				.forEach(/* customList2::remove */ i -> customList2.remove(i) ); // Remove the elements in sorted order


        // Print the updated custom list
        for (int i = 0; i < customList2.size(); i++) {
            System.out.println(customList2.get(i));
        }
    }
}

