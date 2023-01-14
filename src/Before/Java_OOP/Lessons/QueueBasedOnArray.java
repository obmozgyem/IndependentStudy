package Before.Java_OOP.Lessons;

public final class QueueBasedOnArray extends BasedOnArrayDataStorage implements DataStorage {
    public QueueBasedOnArray(int size) {
        super(size);
    }

    public QueueBasedOnArray() {
    }

    @Override
    public int get() {
        if (size > 0) {
            int result = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            size--;
            return result;
        } else {
            throw new RuntimeException("Queue is Empty");
        }

    }

}
