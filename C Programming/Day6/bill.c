#include <stdio.h>

int main() {
    float units, bill;
    scanf("%f", &units);

    bill = (units <= 100.0) ? (units * 3.00) : ((units - 100) * 4.50 + (100 * 3.00));
    printf("Bill amount: %.2f\n", bill);

    return 0;
}