package hr.ferit.tumiljanovic.bmicalculator;


public class InvalidInputException extends Exception {

    private String msg= "Invalid input!";

    public InvalidInputException() {
        super();
    }

    public InvalidInputException(String msg) {
        super(msg);
    }
}
