package com.pingwit_java_course.part15.point_4;

public class MyCustomException extends Exception {

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
