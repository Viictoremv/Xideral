// File: UncheckedExceptionDemo.java
public class UncheckedExceptionDemo {
    public static int divide(int a, int b) {
        return a / b; // may throw ArithmeticException
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }
}
