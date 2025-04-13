public class Main {
    public static void main(String[] args) {
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
    }
}
