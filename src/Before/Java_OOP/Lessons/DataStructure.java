package Before.Java_OOP.Lessons;

public interface DataStructure {
    void add(int value);

    void add(int[] value);

    void add(DynaArray dynaArray);

    void add(LinkedList list);

    int size();
    void clear();
    int[] toArray();
    boolean remove(int value);
    boolean contains(int value);
}
