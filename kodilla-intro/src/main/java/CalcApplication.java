public class CalcApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(12);
        System.out.println("Area of the Circle with radius 12 equals: " + area);

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equal to " + p);

        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.counter);
    }
}
