package com.pingwit_java_course.part11;

public class FactorialRecursionExample {
    public static void main(String[] args) {

        long result = 1;
        int number = 5;

        result = factorialRecursion(result, number);
        System.out.println("Final result: " + result);

        long cycleResult = factorialCycle(number);
        System.out.println("Final cycle result: " + cycleResult);
    }


    private static long factorialCycle(int number) {
        long result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }


    private static long factorialRecursion(long result, int number) {
        if (number == 0) {
            return result;
        }

        System.out.println("result: " + result);

        return factorialRecursion(result * number, --number);
    }
}
