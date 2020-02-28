public class King extends Piece {

    public King(PieceEnum king, int rank, int file){
        super(king, rank, file);
    }

    @Override
    public String[] getPossibleMoves(ChessBoard cb) {
        return new String[0];
    }


}
