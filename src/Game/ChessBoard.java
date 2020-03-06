package Game;

import Pieces.*;

public class ChessBoard {
	private Piece[][] board;

	public ChessBoard(){
		board = new Piece[8][8];
		initBoard();
	}

	public void movePiece(Position initPos, Position newPos){
		Piece[][] newBoard = new Piece[8][8];
		for(int i=0; i<board.length; i++){
			for(int j=0; j< board[i].length; j++){
				Piece p = board[i][j];
				System.out.println(p);
				Position piecePos = p.getPos();
				if(piecePos.getFile() == initPos.getFile() && piecePos.getRank() == initPos.getRank()){
					newBoard[newPos.getRank()][newPos.getFile()] = p;
					newBoard[initPos.getRank()][initPos.getFile()] = new NullPiece(PieceEnum.NULL_PIECE, initPos.getRank(), initPos.getFile());
				}else{
					newBoard[i][j] = p;
				}
			}
		}
//		board[newPos.getRank()][newPos.getFile()] = board[initPos.getRank()][initPos.getFile()];
//		board[initPos.getRank()][initPos.getFile()] = null;
		board = newBoard;
	}


	public void printBoard(){
		System.out.println("PRINTING");
		int count = 8;
		for(Piece[] file: board){
			System.out.print(count);
			count--;
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
			System.out.print(" \u3000\u205F" + (char)letter);
			letter++;
		}
		System.out.println("");
	}

	public void initBoard(){
		board[0][0] = new Rook(PieceEnum.BLACK_ROOK, 0, 0);
		board[0][7] = new Rook(PieceEnum.BLACK_ROOK, 0, 7);
		board[0][1] = new Knight(PieceEnum.BLACK_KNIGHT, 0, 1);
		board[0][6] = new Knight(PieceEnum.BLACK_KNIGHT, 0, 6);
		board[0][2] = new Bishop(PieceEnum.BLACK_BISHOP, 0, 2);
		board[0][5] = new Bishop(PieceEnum.BLACK_BISHOP, 0, 5);
		board[0][4] = new King(PieceEnum.BLACK_KING, 0, 4);
		board[0][3] = new Queen(PieceEnum.BLACK_QUEEN, 0, 3);
		for(int i = 0; i < 8; i++){
			board[1][i] = new Pawn(PieceEnum.BLACK_PAWN, 1, i);
			board[6][i] =  new Pawn(PieceEnum.WHITE_PAWN, 6, i);
		}
		board[7][0] = new Rook(PieceEnum.WHITE_ROOK, 7, 0);
		board[7][7] = new Rook(PieceEnum.WHITE_ROOK, 7, 7);
		board[7][1] = new Knight(PieceEnum.WHITE_KNIGHT, 7, 1);
		board[7][6] = new Knight(PieceEnum.WHITE_KNIGHT, 7, 6);
		board[7][2] = new Bishop(PieceEnum.WHITE_BISHOP, 7, 2);
		board[7][5] = new Bishop(PieceEnum.WHITE_BISHOP, 7, 5);
		board[7][4] = new King(PieceEnum.WHITE_KING, 7, 4);
		board[7][3] = new Queen(PieceEnum.WHITE_QUEEN, 7, 3);
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j< board[i].length; j++){
				if(board[i][j] == null){
					board[i][j] = new NullPiece(PieceEnum.NULL_PIECE, i,j);
				}
			}
		}
	}

	public Piece[][] getBoard(){
		return board;
	}
}
