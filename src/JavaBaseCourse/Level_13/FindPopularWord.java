package JavaBaseCourse.Level_13;


//не доделывал, так лучше сделать через мапу, а тут через двухмерный массив придлогали сделать
//разбивка по словам в соседней функции
public class FindPopularWord {
    public static void main(String[] args) {

        String text = "hello java world java hello I Hello Java World java";
        String temp = text.toLowerCase();
        String tempArray[] = tempArrayWithNoRegistr(temp);

        String result = mostPopularWords(tempArray);
        System.out.println(result);
    }


    private static String[] tempArrayWithNoRegistr(String temp) {
        String temp2[] = temp.split(" ");
        return temp2;
    }

    private static String mostPopularWords(String[] temp) {
        int count = 0;
        int counter[] = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {

        }
        return null;
    }

}
