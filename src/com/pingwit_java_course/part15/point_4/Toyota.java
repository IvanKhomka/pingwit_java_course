package com.pingwit_java_course.part15.point_4;

import java.io.IOException;

public class Toyota implements Car {
    @Override
    public boolean start() throws MyCustomException, IOException {
        return false;
    }

    @Override
    public boolean stop() throws RuntimeException {
        return false;
    }
}
