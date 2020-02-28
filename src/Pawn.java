public class Pawn extends Piece {
    public Pawn(PieceEnum pawn, int rank, int file) {
        super(pawn, rank, file);
    }

    @Override
    String[] getPossibleMoves() {
        return new String[0];
    }

    @Override
    void move() {

    }
}
