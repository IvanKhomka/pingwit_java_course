package com.pingwit_java_course.part26.homework.task1;

record Phone(String model) {
    @Override // toString для рекордов переопределен по умолчанию, если ты хотел просто красиво model распечатать, то ок, но в будущем лучше так не делать.
    // toString обычно для обучения и для логгирования используют, но не как инструмент для работы с данными
    public String toString() {
        return model;
    }
}