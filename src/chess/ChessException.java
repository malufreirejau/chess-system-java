package chess;

public class ChessException extends RuntimeException {
    private static final long serialVersionUid = 1L;

     public ChessException (String msg) {
         super(msg);
     }
}
