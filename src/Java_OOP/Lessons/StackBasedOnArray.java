package Java_OOP.Lessons;

public final class StackBasedOnArray extends BasedOnArrayDataStorage implements DataStorage {

    public StackBasedOnArray(int size) {
        super(size);
    }

    public StackBasedOnArray() {
    }

    @Override
    public int get() {
        if (size > 0) {

            return array[--size];
        } else {
            throw new RuntimeException("Stack is Empty");
        }

    }


}
