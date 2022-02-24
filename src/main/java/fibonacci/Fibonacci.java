package fibonacci;

public class Fibonacci {
    public static int getFibonacci(int index) {
        if (index == 0) {
            return 0;
        }
        if (index <= 2) {
            return 1;
        }
        return getFibonacci(index - 1) + getFibonacci(index - 2);
    }
}
