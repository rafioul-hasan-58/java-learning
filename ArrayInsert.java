class ArrayInsert {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int position = 2;
        int value = 25;
        int[] newArry = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArry[i] = arr[i];
        }
        newArry[position] = value;

        for (int i = position; i < arr.length; i++) {
            newArry[i + 1] = arr[i];
        }

        System.out.println(java.util.Arrays.toString(newArry));
    }
}