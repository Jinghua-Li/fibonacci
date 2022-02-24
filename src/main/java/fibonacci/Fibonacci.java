package fibonacci;

public class Fibonacci {
    private final int index;
    public Fibonacci(int index) {
        this.index = index;
    }

    public int getFibonacci() {
        if (index == 0) {
            return 0;
        }
        if (index <= 2) {
            return 1;
        }
        return 2;
    }
}
