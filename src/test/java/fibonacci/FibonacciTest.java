package fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {
    @Test
    void should_get_fibonacci_val_0_when_input_0() {
        Fibonacci fibonacci = new Fibonacci(0);
        int value = fibonacci.getFibonacci();
        
        assertEquals(0, value);
    }
    
    @Test
    void should_get_fibonacci_val_1_when_input_1() {
        Fibonacci fibonacci = new Fibonacci(1);
        int value = fibonacci.getFibonacci();
        
        assertEquals(1, value);
    }
    
    @Test
    void should_get_fibonacci_val_1_when_input_2() {
        Fibonacci fibonacci = new Fibonacci(2);
        int value = fibonacci.getFibonacci();
        
        assertEquals(1, value);
    }
}
