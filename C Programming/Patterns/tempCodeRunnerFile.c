int main() {
    int n = 10;  // size of square (you can change)
    int hole = 4; // size of hollow middle

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            // conditions for border OR hole area
            if (i == 1 || i == n || j == 1 || j == n) {
                printf("* ");
            }
            else if (i > hole && i <= n - hole && j > hole && j <= n - hole) {
                printf("  "); // hollow space inside
            }
            else {
                printf("* ");
            }
        }
        printf("\n");
    }
    return 0;
}