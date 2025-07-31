package telran.fibonacci.test;

import org.junit.jupiter.api.Test;
import telran.fibonacci.model.Fibonacci;

public class TestFibonacci {

    @Test
    void  testFibonacci() {
        Fibonacci fibonacci = new Fibonacci(8);
        Fibonacci fibonacci2 = new Fibonacci(20);
    }
}
