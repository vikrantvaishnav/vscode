#include <stdio.h>
int main() {
    int x = 5, y = 2, z;
    z = x / y * x % y;
    printf("%d\n", z);
    return 0;
}