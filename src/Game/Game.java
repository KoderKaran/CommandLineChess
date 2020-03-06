package Game;

import Pieces.Piece;
import Pieces.Position;

import java.util.Scanner;

public class Game {
	private ChessBoard board;
	private Player[] players;
	private Scanner scn;

	public Game(){
		board = new ChessBoard();
		players = new Player[2];
		scn = new Scanner(System.in);
	}

	public void checkMove(){
		System.out.println("Input your move: ");
		String str = scn.nextLine();
		String[] moveStr = str.split(" ");
		Position startingPiece = Piece.coordsToIndex(moveStr[0]);
		Position targetSquare = Piece.coordsToIndex(moveStr[1]);
		Piece target = board.getBoard()[startingPiece.getRank()][startingPiece.getFile()];
		System.out.println(moveStr[1]);
		if(target.isValidMove(board, moveStr[1])){
			System.out.println("hello");
			board.movePiece(startingPiece,targetSquare);
		}
		board.printBoard();
		cycle();
	}

	public void cycle(){
		checkMove();
		board.printBoard();
	}


	public void printInstructions() {
		System.out.println("To make a move type the coordinates of the piece you want to move, then the desired coordinate, separated with a comma.");
	}
}
