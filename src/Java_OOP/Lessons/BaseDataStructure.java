package Java_OOP.Lessons;

public abstract class BaseDataStructure implements DataStructure{
    protected int count;

    public abstract void add(int value);

    public void add(int[] array) {
        for (int i : array) {
            add(i);
        }
    }

    public void add(DynaArray dynaArray) {
        add(dynaArray.toArray());
    }

    public void add(LinkedList List) {
        add(List.toArray());
    }


    public final int size() {

        return count;
    }

    public void clear() {
        count = 0;
    }
}
