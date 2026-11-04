
class Hello {
    static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        ;
        return sum;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    static int sumDigit(int n) {
        int digitSum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            digitSum += lastDigit;
        }
        return digitSum;
    }

    static int nCr(int n, int r) {
        int f_n = factorial(n);
        int f_r = factorial(r);
        int f_nmr = factorial(n - r);
        int result = f_n / (f_r * (f_nmr));
        return result;
    }

    public static void main(String args[]) {
        System.out.println(nCr(6, 3));

    }
}