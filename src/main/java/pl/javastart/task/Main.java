package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int userNumber = 4;
        System.out.println("Czy liczba " + userNumber + " jest parzysta? " + calc.isEven(userNumber));
        System.out.println("Czy liczba " + userNumber + " jest nieparzysta? " + calc.isOdd(userNumber));
        System.out.println("Kwadrat liczby " + userNumber + " wynosi " + calc.power(userNumber));

        double radius = 1.0;
        double circleField = calc.circleField(radius);
        System.out.println("Pole koła o promieniu " + radius + " wynosi: " + circleField);
    }
}
