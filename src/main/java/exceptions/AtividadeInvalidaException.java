package exceptions;

public class AtividadeInvalidaException extends IllegalStateException{

    public AtividadeInvalidaException(Exception e) {
        super(e);
    }
}
