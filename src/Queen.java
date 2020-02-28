public class Queen extends Piece {
    public Queen(PieceEnum queen, int rank, int file) {
        super(queen, rank, file);
    }

    @Override
    String[] getPossibleMoves() {
        return new String[0];
    }

    @Override
    void move() {

    }
}
