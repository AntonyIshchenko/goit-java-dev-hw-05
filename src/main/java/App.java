import fibonacci.Fibonacci;

public class App {

    public static void main(String[] args) {

        System.out.println("Recursive algorithm fibonacci(6) = " + Fibonacci.fibonacciRecursive(6));
        System.out.println("Time complexity: O(2^n) - exponential");
        System.out.println("Space complexity: O(n) - linear");

        System.out.println("-------------------------------------------");
        System.out.println("Dynamic programming algorithm fibonacci(6) = " + Fibonacci.fibonacciDynamicProgramming(6));
        System.out.println("Time complexity: O(n) - linear");
        System.out.println("Space complexity: O(n) - linear");

        System.out.println("-------------------------------------------");
        System.out.println("Iterative algorithm fibonacci(6) = " + Fibonacci.fibonacciIterative(6));
        System.out.println("Time complexity: O(n) - linear");
        System.out.println("Space complexity: O(1) - constant");
    }

}
