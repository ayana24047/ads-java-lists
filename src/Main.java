public class Main {
    public static void main(String[] args) {
        // --- Тестируем MyArrayList ---
        MyList<String> list = new MyArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Element at index 1: " + list.get(1)); // Banana
        System.out.println("Contains 'Banana'? " + list.contains("Banana")); // true

        list.remove("Banana");
        System.out.println("Size after removal: " + list.size()); // 2

        for (String item : list) {
            System.out.println("Item: " + item);
        }

        // --- Тестируем MyLinkedList ---
        System.out.println("\n--- Testing MyLinkedList ---");
        MyList<String> linkedList = new MyLinkedList<>();

        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        System.out.println("Get index 1: " + linkedList.get(1)); // Two
        linkedList.remove("Two");
        System.out.println("Size after remove: " + linkedList.size()); // 2

        for (String item : linkedList) {
            System.out.println("Item: " + item);
        }
    }
}
