package hr.ferit.tumiljanovic.bmicalculator;

public class EmptyFieldException extends InvalidInputException {

    public EmptyFieldException() {
    }

    public EmptyFieldException(String msg) {
        super(msg);
    }
}
