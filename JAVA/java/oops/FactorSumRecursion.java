public class FactorSumRecursion {

    // Recursive function to calculate sum of factors
    static int sumOfFactors(int n, int i) {
        // Base case: if i > n, stop
        if (i > n) {
            return 0;
        }
        // If i is a factor, add it
        if (n % i == 0) {
            return i + sumOfFactors(n, i + 1);
        } else {
            return sumOfFactors(n, i + 1);
        }
    }

    public static void main(String[] args) {
        int num = 12;  // You can change this input
        int result = sumOfFactors(num, 1);
        System.out.println("Sum of factors of " + num + " = " + result);
    }
}
