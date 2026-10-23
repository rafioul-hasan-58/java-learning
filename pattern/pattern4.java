package pattern;

public class pattern4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j > 0; j--) {
                System.out.print((char) ('A' + j-1) + " ");
            }
            System.out.println();
        }
    }
}
