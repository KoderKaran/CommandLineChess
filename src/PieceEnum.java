public enum PieceEnum {
	BLACK_KING("\u2654", "B"), BLACK_QUEEN("\u2655", "B"), BLACK_ROOK("\u2656", "B"), BLACK_BISHOP("\u2657", "B"), BLACK_KNIGHT("\u2658", "B"), BLACK_PAWN("\u2659", "B"),
	WHITE_KING("\u265A", "W"), WHITE_QUEEN("\u265B", "W"), WHITE_ROOK("\u265C", "W"), WHITE_BISHOP("\u265D", "W"), WHITE_KNIGHT("\u265E", "W"), WHITE_PAWN("\u265F", "W");

	private String unicode;
	private String color;

	PieceEnum(String newUnicode, String newColor) {
		color = newColor;
		unicode = newUnicode;
	}

	public String getColor(){
		return color;
	}

	public String getUnicode(){
		return unicode;
	}
}
