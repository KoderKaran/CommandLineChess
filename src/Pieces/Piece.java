package Pieces;
import Game.ChessBoard;
import java.util.ArrayList;

public abstract class Piece {
	private PieceEnum pe;
	private Position pos;
	private String strPos;
	private int[] possibleDir;

	public Piece(PieceEnum newPe, int initRank, int initFile){
		pe = newPe;
		pos = new Position();
		pos.setFile(initFile);
		pos.setRank(initRank);
		strPos = indexToCoords(pos);
	}

	public int[] getPossibleDir(){
		return possibleDir;
	}

	public void setPossibleDir(int[] newPossibleDir){
		possibleDir = newPossibleDir;
	}

	public PieceEnum getPe(){
		return pe;
	}

	public static Position coordsToIndex(String pos){
		Position newPos = new Position();
		char file = pos.charAt(0);
		int intFile = (int)file-97;
		int rank = Integer.parseInt(pos.substring(1));
		System.out.println("rank "+ rank);
		int newRank;
		if(rank == 8){
			newRank = 0;
		}else if(rank == 7){
			newRank = 1;
		}else if(rank == 6){
			newRank = 2;
		}else if(rank == 5){
			newRank = 3;
		}else if(rank == 4){
			newRank = 4;
		}else if(rank == 3){
			newRank = 5;
		}else if(rank == 2){
			newRank = 6;
		}else{
			newRank = 7;
		}
		newPos.setFile(intFile);
		newPos.setRank(newRank);
		return newPos;
	}

	@Override
	public String toString(){
		return "Pieces.Piece at: " + this.getPos();
	}

	public static String indexToCoords(Position pos){
		int file = pos.getFile();
		int rank = pos.getRank();
		int fileInt = 97 + file;
		char fileChar = (char) fileInt;
		int rankInt;
		if(rank == 0){
			rankInt = 8;
		}else if(rank == 1){
			rankInt = 7;
		}else if(rank == 2){
			rankInt = 6;
		}else if(rank == 3){
			rankInt = 5;
		}else if(rank == 4){
			rankInt = 4;
		}else if(rank == 5){
			rankInt = 3;
		}else if(rank == 6){
			rankInt = 2;
		}else{
			rankInt = 1;
		}
		String coords = String.format(fileChar + "%s", rankInt);
		return coords;
	}

	public String getUnicode(){
		return pe.getUnicode();
	}

	public Position getPos(){
		return pos;
	}

	public abstract ArrayList<Position> getPossibleMoves(ChessBoard cb);
}
