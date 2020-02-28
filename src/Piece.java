public abstract class Piece {

	public Piece(PieceEnum newPe, int initRank, int initFile){
		pe = newPe;
		rank = initRank;
		file = initFile;
	}

	private PieceEnum pe;
	private int rank;
	private int file;

	public void setRank(int newRank){
		if(newRank >= 0 && newRank <= 7){
			rank = newRank;
		}
	}

	public void setFile(int newFile){
		if(newFile >= 0 && newFile <=7){
			file = newFile;
		}
	}

	public PieceEnum getPe(){
		return pe;
	}

	public int getRank(){
		return rank;
	}

	public int getFile(){
		return file;
	}

	public String indexToCoords(int rank, int file){
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
	abstract String[] getPossibleMoves(ChessBoard cb);
}
