package Pieces;
import Game.ChessBoard;
import java.util.ArrayList;

public class NullPiece extends Piece {

	public NullPiece(PieceEnum newPe, int initRank, int initFile){
		super(newPe,initRank,initFile);
	}

	@Override
	public boolean isValidMove(ChessBoard chessBoard, String targetSquare) {
		return false;
	}

	@Override
	public String toString(){
		return "this is the null bruh";
	}

	@Override
	public ArrayList<Position> getPossibleMoves(ChessBoard cb) {
		return new ArrayList<Position>();
	}
}
