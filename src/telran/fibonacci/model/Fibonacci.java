package telran.fibonacci.model;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{
    // Fibonacci fibonacci = new Fibonacci(7);
    // 1,1,2,3,5,8,13,21
    // print all numbers and reduce sum
    // sum = 54;

    // 0,1,1,2,3,5,8,13,21,34

        private int quantity;
        private int[] numbers;

    public Fibonacci(int quantity) {
        setQuantity(quantity);
        this.numbers = new int[this.quantity+1];

        if (this.quantity > 0) numbers[0] = 0;
        if (this.quantity > 1) numbers[1] = 1;

        for (int i = 2; i <= this.quantity; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        int sum = 0;
        for (int i = 1; i <= this.quantity; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < quantity;
            }

            @Override
            public Integer next() {
                return numbers[index++];
            }
        };
    }
}
