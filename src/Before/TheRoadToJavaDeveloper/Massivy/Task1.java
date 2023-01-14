package Before.TheRoadToJavaDeveloper.Massivy;

public class Task1 {
    /*
    Cоздать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.
            Вариант 1: не используя переменную типа String;
    Вариант 2: предварительно собрав значения массива в переменную типа String.
    Подсказка для варианта 2: создать пустую строку можно так: String s = “”;
    */
    public static void main(String[] args) {

        String s1 = "Dima";
        char[] chars1 = s1.toCharArray();
        for (char c : chars1) {
            System.out.println(c);
        }
        System.out.println();

        char[] chars = {'D', 'i', 'm', 'a'};
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}
