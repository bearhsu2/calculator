package idv.kuma;

public class AdvancedCalculator {

    Calculator calculator;

    public AdvancedCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int fibonacci(int n) {

        if (0 >= n) {
            return -1;
        }

        if (1 == n || 2 == n) {
            return 1;
        }

        return calculator.add(fibonacci(n - 1), fibonacci(n - 2));

    }
}
