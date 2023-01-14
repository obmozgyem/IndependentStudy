package Before.Tic_Tac_Toe.componet;

import Before.Tic_Tac_Toe.model.Cell;
import Before.Tic_Tac_Toe.model.GameTable;

public class DrawVerifier {
    public boolean isDraw(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable.isEmpty(new Cell(i, j))) {
                    return false;
                }

            }

        }

        return true;
    }
}
