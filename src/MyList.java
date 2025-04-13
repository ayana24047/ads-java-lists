public interface MyList<T> extends Iterable<T> {
    void add(T item);
    void add(int index, T item);
    T get(int index);
    T remove(int index);
    boolean remove(T item);
    int size();
    boolean isEmpty();
    void clear();
    boolean contains(T item);
}
