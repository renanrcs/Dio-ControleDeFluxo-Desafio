package io.github.renanrcs.exception;

public class InvalidParametersException extends Exception {

    public InvalidParametersException(String message) {
        super(message);
    }

    public static void validateParameters(Integer p1, Integer p2) throws InvalidParametersException {
        if (p1 > p2) {
            throw new InvalidParametersException("The first parameter must not be grater than the second.");
        }
    }

}
