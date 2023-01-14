package Before.Java_OOP.Lessons;

class LinkedListTest {
    public static void main(String[] args) {
        LinkedList secondList = new LinkedList();
       secondList.add(new int[]{4, 5, 6});

        LinkedList list = new LinkedList();
        list.add(new int[]{1, 2, 3});
        list.add(secondList);
         list.add(1);

        System.out.println(list.size());
        System.out.println(list);
    }
}
