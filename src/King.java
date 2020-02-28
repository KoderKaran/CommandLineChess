public class King extends Piece {

    public King(PieceEnum king, int rank, int file){
        super(king, rank, file);
    }

    @Override
    public String getUnicode() {
        return getPe().getUnicode();
    }

    @Override
    public String[] getPossibleMoves() {
        return new String[0];
    }

    @Override
    public void move() {

    }
}