package Before.Java_OOP.Lessons;

public abstract class BasedOnArrayDataStorage implements DataStorage {

    protected int[] array;

    protected int size;

    public BasedOnArrayDataStorage(int size) {
        array = new int[size];
    }

    public BasedOnArrayDataStorage() {
        this(5);
    }

    @Override
    public final void add(int value) {
        if (size == array.length) {
            grow(array.length == 0 ? 5 : array.length * 2);
        }
        array[size++] = value;
    }

    private void grow(int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public final int size() {
        return size;
    }
}
