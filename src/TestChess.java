import Game.Game;
import Game.ChessBoard;
import Pieces.Position;

public class TestChess {
	public static void main(String[] args) throws InterruptedException {
		ChessBoard board = new ChessBoard();
		Game game = new Game();
		board.printBoard();
		game.printInstructions();
		while(true) {
			Position[] moves = game.getMove();
			game.cycle(moves);
		}
	}
}
