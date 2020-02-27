public class Piece {

	private PieceEnum piece;

	public Piece(PieceEnum newPiece){
		piece = newPiece;
	}

	public String getUnicode(){
		return piece.getUnicode();
	}
}
