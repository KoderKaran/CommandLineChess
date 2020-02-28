public class Knight extends Piece {
    public Knight(PieceEnum knight, int rank, int file) {
        super(knight, rank, file);
    }

    @Override
    String[] getPossibleMoves() {
        return new String[0];
    }

    @Override
    void move() {

    }
}
