import java.util.ArrayList;

public class NullPiece extends Piece {

	public NullPiece(PieceEnum newPe, int initRank, int initFile){
		super(newPe,initRank,initFile);
	}

	@Override
	ArrayList<Position> getPossibleMoves(ChessBoard cb) {
		return new ArrayList<Position>();
	}
}
