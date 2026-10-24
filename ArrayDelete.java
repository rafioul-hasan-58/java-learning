public class ArrayDelete {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int position = 2;

        int[] newArry = new int[arr.length - 1];

        for (int i = 0; i < position; i++) {
            newArry[i] = arr[i];

        }

        for (int i = position + 1; i < arr.length; i++) {
            newArry[i-1] = arr[i];
        }

        System.out.println(java.util.Arrays.toString(newArry));
    }
}
