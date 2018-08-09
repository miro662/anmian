class FizzBuzzFactory {
    private int currentNumber;

    FizzBuzzFactory(int startingNumber) {
        currentNumber = startingNumber;
    }

    FizzBuzz next() {
        return new FizzBuzz(currentNumber++);
    }
}
