package fibonacci;

public class Fibonacci {

    public static long fibonacciDynamicProgramming(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static long fibonacciIterative(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long prev = 0;
        long current = 1;
        long next;

        for (int i = 2; i <= n; i++) {
            next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }

    public static long fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

}
