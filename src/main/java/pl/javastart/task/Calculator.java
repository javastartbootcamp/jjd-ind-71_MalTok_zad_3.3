package pl.javastart.task;

public class Calculator {
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return number % 2 == 1;
    }

    double circleField(double radius) {
        return 3.14159 * radius * radius; // powinno być użyta final double PI = 3.14159;
    }

    int power(int number) {
        return number * number;
    }
}
