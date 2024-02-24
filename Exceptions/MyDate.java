package Exceptions;

public class MyDate extends RuntimeException {
    public MyDate(String date) {
        super(date);
    }
}