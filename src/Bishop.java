public class Bishop extends Piece {
    public Bishop(PieceEnum bishop, int rank, int file) {
        super(bishop, rank, file);
    }

    @Override
    String[] getPossibleMoves() {
        return new String[0];
    }

    @Override
    void move() {

    }
}
