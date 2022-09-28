package Java_OOP.Lessons;

class DataStorageTest {
    public static void main(String[] args) {
        DataStorage dataStorage = new StackBasedOnArray();

        for (int i = 0; i < 5; i++) {
            dataStorage.add(i);
        }

        while (dataStorage.size() > 0) {
            System.out.print(dataStorage.get() + " ");
        }
        System.out.println();


    }
}
