public enum PieceEnum {
	BLACK_KING("\u2654"), BLACK_QUEEN("\u2655"), BLACK_ROOK("\u2656"), BLACK_BISHOP("\u2657"), BLACK_KNIGHT("\u2658"), BLACK_PAWN("\u2659"),
	WHITE_KING("\u265A"), WHITE_QUEEN("\u265B"), WHITE_ROOK("\u265C"), WHITE_BISHOP("\u265D"), WHITE_KNIGHT("\u265E"), WHITE_PAWN("\u265F");

	private String unicode;

	PieceEnum(String newUnicode) {
		unicode = newUnicode;
	}

	public String getUnicode(){
		return unicode;
	}
}
