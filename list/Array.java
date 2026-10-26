package list;
class Array {

    static int add(int a, int b) {
        return a + b;

    }

    static int add(int a, int b, int c) {
        return a + b + c;

    }

    public static void main(String[] args) {
        int result = add(1, 2);
        int result2 = add(1, 2, 3);
        System.out.println(result);
        System.out.println(result2);
    }
}