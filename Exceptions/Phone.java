package Exceptions;

public class Phone extends NumberFormatException {
    public Phone(String phone) {
        super(phone);
    }
}