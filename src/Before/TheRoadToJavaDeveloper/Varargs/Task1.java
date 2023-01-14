package Before.TheRoadToJavaDeveloper.Varargs;

public class Task1 {
    public static void main(String[] args) {
        String name = "Nick";
        String name2 = "Mike";
        String result = doSomething(name2, name2, name);

        System.out.println(result);


    }

    private static String doSomething(String... strings) {
        var result = "";

        for (String s : strings) {
            result += " " + s;
        }
        return result;

    }

}
