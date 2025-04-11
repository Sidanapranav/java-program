public class Calculator{
    // Adds two numbers and returns the result
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts second number from the first
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides first number by second number
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return (double) a / b;
    }
}
