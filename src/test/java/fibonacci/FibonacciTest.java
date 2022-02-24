package fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {
    @Test
    void should_get_fibonacci_val_0_when_input_0() {
        int value = Fibonacci.getFibonacci(0);
        
        assertEquals(0, value);
    }
    
    @Test
    void should_get_fibonacci_val_1_when_input_1() {
        int value = Fibonacci.getFibonacci(1);
        
        assertEquals(1, value);
    }
    
    @Test
    void should_get_fibonacci_val_1_when_input_2() {
        int value = Fibonacci.getFibonacci(2);
        
        assertEquals(1, value);
    }
    
    @Test
    void should_get_fibonacci_val_2_when_input_3() {
        int value = Fibonacci.getFibonacci(3);
        
        assertEquals(2, value);
    }
    
    @Test
    void should_get_fibonacci_val_3_when_input_4() {
        int value = Fibonacci.getFibonacci(4);
        
        assertEquals(3, value);
    }
}
