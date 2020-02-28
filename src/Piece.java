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

	public String getUnicode(){
		return pe.getUnicode();
	}
	abstract String[] getPossibleMoves();
	abstract void move();
}
