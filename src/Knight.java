public class Knight extends Piece {
    public Knight(PieceEnum knight, int rank, int file) {
        super(knight, rank, file);
    }

    @Override
    public String[] getPossibleMoves(ChessBoard cb) {
        return new String[0];
    }


}
