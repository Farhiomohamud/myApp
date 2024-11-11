import java.util.Deque;
import java.util.ArrayDeque;

public class LinkStack {
    public static void main(String[] args) {
        // Initialize the deque (double-ended queue)
        Deque<String> names = new ArrayDeque<>();

        // Push elements into the deque
        names.add("suad"); // equivalent to push in stack
        names.add("salma");
        names.add("salima");
        names.add("salim");
        names.add("sacid");

        // Display the deque before popping
        System.out.println("Deque before popping: " + names);

        // Pop the last element (like a stack)
        String lastElement = names.removeLast(); // Removes and returns the last element
        System.out.println("Popped last element: " + lastElement);

        // Pop the first element
        String firstElement = names.removeFirst(); // Removes and returns the first element
        System.out.println("Popped first element: " + firstElement);

        // Display the deque after popping
        System.out.println("Deque after popping: " +names);
}
}
