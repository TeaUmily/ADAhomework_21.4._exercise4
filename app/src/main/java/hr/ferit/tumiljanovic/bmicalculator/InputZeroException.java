package hr.ferit.tumiljanovic.bmicalculator;

public class InputZeroException extends InvalidInputException {

    public InputZeroException() {
    }

    public InputZeroException(String msg) {
        super(msg);
    }
}
