package TheRoadToJavaDeveloper;

public class Figure {
    public static void main(String[] args) {
        int height = 5, width = 10;
        char dash = '-', pipe = '|', space = ' ';

        char[][] rectangle = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == (height - 1)) {
                    rectangle[i][j] = dash;
                } else if (j == 0 || j == (width - 1)) {
                    rectangle[i][j] = pipe;
                } else {
                    rectangle[i][j] = space;
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }

    }

}

