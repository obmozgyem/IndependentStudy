package Tic_Tac_Toe;

import Tic_Tac_Toe.componet.*;

public final class launcher {
    public static void main(String[] args) {

        final Game game = new Game(
                new DataPrinter(), new ComputerMove(), new UserMove(), new WinnerVerifier(), new DrawVerifier()
        );
        game.play();
    }
}
