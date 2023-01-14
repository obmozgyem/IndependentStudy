package Before.Java_OOP.Lessons;

import java.util.Arrays;

public class DynaArray extends BaseDataStructure {

    private int[] result = new int[5];


    @Override
    public void add(int value) {
        if (count == result.length) {
            grow(result.length * 2);
        }
        result[count++] = value;
    }

    @Override
    public void add(int[] array) {
        add(array, array.length);

    }

    @Override
    public void add(DynaArray dynaArray) {
        add(dynaArray.result, dynaArray.count);

    }

    void grow(int length) {
        int[] newArray = new int[length];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }

    private void add(int[] array, int length) {
        if (result.length - count < length) {
            grow(count + length);
        }
        System.arraycopy(array, 0, result, count, length);
        count += length;
    }

    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }

    @Override
    public boolean remove(int value) {
        int index = indexOf(value);
        if (index != -1) {
            removeByIndex(index);
            return true;
        } else {
            return false;
        }
    }

    private void removeByIndex(int index) {
        if (index < count - 1) {
            System.arraycopy(result, index + 1, result, index, count - 1 - index);
        }
        count--;
    }

    private int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (result[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder().append('[');
        for (int i = 0; i < count; i++) {
            stringBuilder.append(result[i]);
            if (i < count - 1) {
                stringBuilder.append(',').append(' ');
            }
        }
        return stringBuilder.append(']').toString();
    }


}
