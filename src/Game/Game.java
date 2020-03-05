package Game;

import Pieces.Piece;
import Pieces.Position;

import java.util.ArrayList;
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

	public Position[] getMove(){
		System.out.println("Input your move: ");
		Position[] moves = new Position[2];
		String str = scn.nextLine();
		String[] moveStr = str.split(",");
		Position startingPiece = Piece.coordsToIndex(moveStr[0]);
		Position targetSquare = Piece.coordsToIndex(moveStr[1]);
		Piece target = board.getBoard()[startingPiece.getRank()][startingPiece.getFile()];
		ArrayList<Position> possiblePos = null;
		if(target != null){
			possiblePos = target.getPossibleMoves(board);
			moves[0] = startingPiece;
		}else{
			System.out.println("There is no piece at " + moveStr[0] + " please try again.");
			getMove();
		}
		boolean found = false;
		for(Position p : possiblePos){
			if(p.checkEquality(targetSquare)){
				found = true;
				break;
			}
		}
		if(found){
			moves[1] = targetSquare;
		}else{
			System.out.println(moveStr[1] + " is not a valid move, please try again.");
			getMove();
		}
		return moves;
	}

	public void cycle(Position[] moves){
		Position init = moves[0];
		Position ne = moves[1];
		board.movePiece(init, ne);
		board.printBoard();
	}


	public void printInstructions() {
		System.out.println("To make a move type the coordinates of the piece you want to move, then the desired coordinate, separated with a comma.");
	}
}
