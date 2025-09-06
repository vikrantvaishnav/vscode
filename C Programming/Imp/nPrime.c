#include <stdio.h>

int main() {
    int n, count = 0, num = 2;
    scanf("%d", &n);

    if (n <= 0) {
        printf("Invalid input. Please enter a positive number.");
    } else {
        printf("First %d prime numbers are:\n", n);
        while (count < n) {
            int isPrime = 1;
            for (int i = 2; i <= num / 2 ; i++) /* i * i <= num  we can use this also*/{
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime) {
                printf("%d ", num);
                count++;
            }
            num++;
        }
        printf("\n");
    }
    return 0;
}