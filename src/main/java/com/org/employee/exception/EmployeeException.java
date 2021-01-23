package com.org.employee.exception;

/**
 * class to handle exceptions
 * @author M1053970
 */
public class EmployeeException extends Exception {

    private static final long serialVersionUID = 1L;

    private String message;


    public EmployeeException(String message) {
        super();
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
