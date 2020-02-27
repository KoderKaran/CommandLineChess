public class ChessBoard {
	private Piece[][] board;

	public ChessBoard(){
		board = new Piece[8][8];
		initBoard();
	}

	public void printBoard(){
		int count = 1;
		for(Piece[] file: board){
			System.out.print(count);
			count++;
			for(Piece rank: file){
				if(rank == null){
					System.out.print(" [\u3000]");
				}else {
					System.out.print(" [" + rank.getUnicode() + "]");
				}
			}
			System.out.println("");
		}
		int letter = 97;
		for(Piece[] fileLabel: board){
			System.out.print(" \u3000\u205F\u2028" + (char)letter);
			letter++;
		}
	}

	public void initBoard(){
		board[0][0] = new Piece(PieceEnum.BLACK_ROOK);
		board[0][7] = new Piece(PieceEnum.BLACK_ROOK);
		board[0][1] = new Piece(PieceEnum.BLACK_KNIGHT);
		board[0][6] = new Piece(PieceEnum.BLACK_KNIGHT);
		board[0][2] = new Piece(PieceEnum.BLACK_BISHOP);
		board[0][5] = new Piece(PieceEnum.BLACK_BISHOP);
		board[0][4] = new Piece(PieceEnum.BLACK_KING);
		board[0][3] = new Piece(PieceEnum.BLACK_QUEEN);
		for(int i = 0; i < 8; i++){
			board[1][i] = new Piece(PieceEnum.BLACK_PAWN);
			board[6][i] = new Piece(PieceEnum.WHITE_PAWN);
		}
		board[7][0] = new Piece(PieceEnum.WHITE_ROOK);
		board[7][7] = new Piece(PieceEnum.WHITE_ROOK);
		board[7][1] = new Piece(PieceEnum.WHITE_KNIGHT);
		board[7][6] = new Piece(PieceEnum.WHITE_KNIGHT);
		board[7][2] = new Piece(PieceEnum.WHITE_BISHOP);
		board[7][5] = new Piece(PieceEnum.WHITE_BISHOP);
		board[7][4] = new Piece(PieceEnum.WHITE_KING);
		board[7][3] = new Piece(PieceEnum.WHITE_QUEEN);

	}
}
