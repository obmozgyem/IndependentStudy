package Before.TheRoadToJavaDeveloper.Lesson8;

public class Count {
    final String name;
    public int countNumber;


    public Count(String count, int countNumber) {

        this.name = count;
        this.countNumber = 0;
    }

    public int countPlus(int countNumber) {
        int result = 0;
        result += countNumber;
        return result;
    }

    public int countMinus(int countNumber) {
        int result = 0;
        result -= countNumber;
        return result;
    }

    public int increment() {
        return ++countNumber;
    }

    public int decrement() {
        return --countNumber;
    }

}
