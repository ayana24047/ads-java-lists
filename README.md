# Custom List Implementations in Java

This project demonstrates manual implementation of core data structures in Java without using `java.util.*` (except `Iterator`).

## ✅ Implemented Components

### 🔹 Interface
- `MyList<T>` — generic list interface

### 🔹 Physical Data Structures
- `MyArrayList<T>` — array-based list
- `MyLinkedList<T>` — doubly linked list

### 🔹 Logical Data Structures
- `MyStack<T>` — LIFO stack based on `MyArrayList`
- `MyQueue<T>` — FIFO queue based on `MyLinkedList`
- `MyMinHeap<T>` — Min-heap priority queue based on `MyArrayList`

## 🧪 Testing

All data structures are tested in `Main.java`. Example:

```java
MyList<String> arrayList = new MyArrayList<>();
arrayList.add("Apple");
arrayList.add("Banana");
System.out.println(arrayList.get(1)); // Banana

