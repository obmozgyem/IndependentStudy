package Tic_Tac_Toe.componet;

import Tic_Tac_Toe.model.Cell;
import Tic_Tac_Toe.model.GameTable;

public class DataPrinter {
    public void printMappingTable() {
        System.out.println("-------------");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("-------------");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("-------------");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("-------------");


    }

    public void printGameTable(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");

            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable.getSign(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");

    }
}
