
class Hello {
    static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        ;
        return sum;
    }

    static int getFectorial(int n) {
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
        int result = (getFectorial(n) / (getFectorial(r) * (getFectorial(n - r))));
        return result;
    }

    public static void main(String args[]) {
        System.out.println(nCr(6,3));

    }
}