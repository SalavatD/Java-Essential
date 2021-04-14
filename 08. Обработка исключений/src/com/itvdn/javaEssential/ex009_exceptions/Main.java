package com.itvdn.javaEssential.ex009_exceptions;

/**
 * Обработка внутренних исключений.
 */
class ClassWithException {
    public void throwInner() throws Exception {
        throw new Exception("Это внутреннее исключение!");
    }

    public void catchInner() throws Exception {
        try {
            this.throwInner();
        } catch (Exception e) {
            throw new Exception("Это внешнее исключение!", e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ClassWithException instance = new ClassWithException();
        //instance.catchInner(); // Попробовать вызвать.
        try {
            instance.catchInner();
        } catch (Exception exception) {
            System.out.println("Exception caught: " + exception.getMessage());
            System.out.println("Cause Exception:  " + exception.getCause());
        }
    }
}
