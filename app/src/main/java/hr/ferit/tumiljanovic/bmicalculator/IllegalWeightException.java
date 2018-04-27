package hr.ferit.tumiljanovic.bmicalculator;

public class IllegalWeightException extends InvalidInputException{

    public IllegalWeightException() {
    }

    public IllegalWeightException(String msg) {
        super(msg);
    }
}
