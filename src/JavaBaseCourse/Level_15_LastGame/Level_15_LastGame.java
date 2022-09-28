package JavaBaseCourse.Level_15_LastGame;

import java.util.Random;
import java.util.Scanner;

public class Level_15_LastGame {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        printGameTable();
        char[][] gameTable = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };


        if (new Random().nextBoolean()) {
            makeComputerMove(gameTable);
            printTableMapping(gameTable);

        }
        while (true) {
            makeUserMove(gameTable);
            printTableMapping(gameTable);
            if (isUserWin(gameTable)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            makeComputerMove(gameTable);
            printTableMapping(gameTable);
            if (isComputerWin(gameTable)) {
                System.out.println("YOU LOST!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER");

    }


    private static void printGameTable() {
        char[][] mappingTable = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };
        printTableMapping(mappingTable);

    }


    private static void printTableMapping(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");

            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");

    }

    private static void makeUserMove(char[][] gameTable) {
        while (true) {
            System.out.println("Please type number between 1 and 9:");

            String number = new Scanner(System.in).nextLine();

            if (number.length() == 1) {
                char digit = number.charAt(0);
                if (digit >= '1' && digit <= '9') {
                    if (makeUserMoveToCell(gameTable, digit)) {
                        return;
                    }


                }
            }
        }

    }

    private static boolean makeUserMoveToCell(char[][] gameTable, char digit) {
        char[][] mappingTable = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };

        for (int i = 0; i < mappingTable.length; i++) {
            for (int j = 0; j < mappingTable[i].length; j++) {
                if (mappingTable[i][j] == digit) {
                    if (gameTable[i][j] == ' ') {
                        gameTable[i][j] = 'X';
                        return true;
                    } else {
                        System.out.println("Can't make a move, because the cell is not free! Try again!");
                        System.out.println();
                        return false;
                    }
                }

            }
        }
        return false;
    }

    //    private  static void makeComputerMoveOnFirst(char[][] gameTable) {
//        if (gameTable[1][1]='X') {
//
//        }
//    }
    private static void makeComputerMove(char[][] gameTable) {
        if (gameTable[1][1] == 'X') {
            gameTable[1][1] = 'X';
        } else  if (gameTable[1][1] == ' ' || (gameTable[0][0] == gameTable[0][1] && gameTable[0][0] == gameTable[0][2] && gameTable[0][0] == ' ') &&
                (gameTable[1][0] == gameTable[0][1] && gameTable[1][0] == gameTable[1][2] && gameTable[1][0] == ' ') &&
                (gameTable[2][0] == gameTable[0][1] && gameTable[2][0] == gameTable[1][2] && gameTable[2][0] == ' ')

        ) {
            gameTable[1][1] = '0';
            return;
        }


        Random random = new Random();
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);


            if (gameTable[row][col] == ' ') {
                gameTable[row][col] = '0';
                System.out.println("Computer made a move.");
                return;
            }
        }

    }


    private static boolean isUserWin(char[][] gameTable) {
        return isWinner(gameTable, 'X');
    }

    private static boolean isComputerWin(char[][] gameTable) {


        return isWinner(gameTable, '0');
    }

    private static boolean isWinner(char[][] gameTable, char ch) {
        for (int i = 0; i < 3; i++) { //строка
            if (gameTable[i][0] == gameTable[i][1] && gameTable[i][0] == gameTable[i][2] && gameTable[i][0] == ch) {
                return true;
            }
        }


        for (int i = 0; i < 3; i++) { //столбец
            if (gameTable[0][i] == gameTable[1][i] && gameTable[0][i] == gameTable[2][i] && gameTable[0][i] == ch) {
                return true;
            }

        }
        if (gameTable[0][0] == gameTable[1][1] && gameTable[0][0] == gameTable[2][2] && gameTable[0][0] == ch) {
            return true; //диагональ
        }
        if (gameTable[0][2] == gameTable[1][1] && gameTable[0][2] == gameTable[2][0] && gameTable[0][2] == ch) {
            return true; //диагональ
        }


        return false;
    }


    private static boolean isDraw(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable[i][j] == ' ') {
                    return false;
                }

            }

        }

        return true;
    }


}
