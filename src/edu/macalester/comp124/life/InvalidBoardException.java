package edu.macalester.comp124.life;

/**
 * Thrown by GameBoard.load to indicate an invalid board file.
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 *
 * Edited by Marcio Porto for COMP 124 - Game of Life Lab
 *
 */
@SuppressWarnings("serial")
public class InvalidBoardException extends Exception {

    public InvalidBoardException() {
        super();
    }
    
    public InvalidBoardException(String what) {
        super(what);
    }
    
    public InvalidBoardException(String what, Throwable cause) {
        super(what, cause);
    }
    
    public InvalidBoardException(Throwable cause) {
        super(cause);
    }
}
