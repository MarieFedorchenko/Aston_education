public class Factorial {

    public long calculateFactorial(int n) {

        long factorial = 1;

        if (n > 0) {

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        }
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа определить нельзя.");
        }

        return factorial;
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();

        System.out.println(factorial.calculateFactorial(3));
    }
}
