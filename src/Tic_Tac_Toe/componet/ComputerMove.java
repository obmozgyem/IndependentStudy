package Tic_Tac_Toe.componet;

import Tic_Tac_Toe.model.Cell;
import Tic_Tac_Toe.model.GameTable;

import java.util.Random;

public class ComputerMove {
    public void make(GameTable gameTable) {
        Random random = new Random();

        while (true) {
            final int row = random.nextInt(3);
            final int col = random.nextInt(3);

            final Cell randomCell = new Cell(row, col);


            if (gameTable.isEmpty(randomCell)) {
                gameTable.setSign(randomCell, '0');
                System.out.println("Computer made a move.");
                return;
            }
        }

    }
}
