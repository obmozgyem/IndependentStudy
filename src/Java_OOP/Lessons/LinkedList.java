package Java_OOP.Lessons;

public class LinkedList extends BaseDataStructure {

    private Item first;
    private Item last;

@Override
    public void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
    }

    @Override
    public void add(LinkedList secondList) {
        if (secondList.count > 0) {
            if (first == null) {
                first = secondList.first;
            } else {
                last.next = secondList.first;
            }
            last = secondList.last;
            count += secondList.count;
        }
    }
    public int[] toArray() {
        int[] result=new int[count];
        int index=0;
        Item current = first;
        while (current != null) {
           result[index++]=current.value;
            current = current.next;

        }
        return  result;
    }
@Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder().append('[');
        Item current = first;
        while (current != null) {
            stringBuilder.append(current.value);
            if (current.next != null) {
                stringBuilder.append(", ");
            }
            current = current.next;
        }
        return stringBuilder.append(']').toString();
    }
@Override
    public void clear() {

        first = null;
        last = null;
         super.clear();
    }

    public boolean remove(int value) {

        Pair pair = findPair(value);
        if (pair != null) {
            if (pair.current == first && pair.current == last) {
                first = null;
                last = null;

            } else if (pair.current == first) {
                first = pair.current.next;

            } else {
                pair.previous.next = pair.current.next;
                if (pair.current == last) {
                    last = pair.current;

                }
            }
            count--;
            return true;

        }
        return false;
    }

    private Pair findPair(int value) {
        Item previous = first;
        Item current = first;
        while (current != null) {
            if (current.value == value) {
                return new Pair(previous, current);
            } else {
                previous = current;
                current = current.next;
            }
        }
        return null;
    }



    public boolean contains(int value) {

        return findPair(value)!=null;
    }




    private static class Pair {
        private Pair(Item previous, Item current) {
            this.previous = previous;
            this.current = current;
        }

        private Item previous;
        private Item current;


    }

    private static class Item {

        private int value;

        private Item next;

        private Item(int value) {
            this.value = value;
        }
    }


}

