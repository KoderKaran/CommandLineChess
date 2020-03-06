import Game.ChessBoard;
import Game.Game;

public class TestChess {
	public static void main(String[] args) throws InterruptedException {
		ChessBoard board = new ChessBoard();
		Game game = new Game();
		board.printBoard();
		game.printInstructions();
		while(true) {
			game.cycle();
		}
	}
}
