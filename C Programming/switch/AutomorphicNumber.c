#include <stdio.h>
#include <math.h>

int main() {
    int num;
    scanf("%d", &num);

    int square = num * num;
    int temp = num;
    int modulus=1;
    while (temp > 0) {
       
        modulus = modulus*10;
        temp /= 10;
    }
   
printf("%d\n",modulus);
    if (square % modulus == num) {
        printf("Automorphic");
    } else {
        printf("Not Automorphic");
    }

    return 0;
}
