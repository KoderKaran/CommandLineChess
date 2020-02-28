public class Rook extends Piece {
    public Rook(PieceEnum rook, int rank, int file) {
        super(rook, rank, file);
    }

    @Override
    String[] getPossibleMoves() {
        return new String[0];
    }

    @Override
    void move() {

    }
}
