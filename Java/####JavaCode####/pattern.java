public class pattern {
    public static void main(String[] args) {
    int n = 4;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print((char) ('A' + i + j) + " ");
        }
        System.out.println();
    }
}
}
