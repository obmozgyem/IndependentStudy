package Tic_Tac_Toe;

public final class Launcher {
    public static void main(String[] args) {

        final Game game = new Game(
                new DataPrinter(), new ComputerMove(), new UserMove(), new WinnerVerifier(), new DrawVerifier()
        );
        game.play();
    }
}
