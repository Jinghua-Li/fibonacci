package fibonacci;

public class Fibonacci {
    private final int index;
    public Fibonacci(int index) {
        this.index = index;
    }

    public int getFibonacci() {
        if (index == 1) {
            return 1;
        }
        return 0;
    }
}
