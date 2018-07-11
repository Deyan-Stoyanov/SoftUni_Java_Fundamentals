package problem9_custom_list_iterator;

public interface List<T extends Comparable<T>> {
    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int firstIndex, int secondIndex);

    int countGreaterThan(T element);

    T getMax();

    T getMin();

    Iterable<T> getElements();

    void sort();
}