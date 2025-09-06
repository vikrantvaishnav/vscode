#include<stdio.h>

int main(){
    int num1, num2, lcm;

    scanf("%d%d", &num1, &num2);
    printf("LCM of %d and %d = ", num1, num2);

    for (lcm = (num1 > num2 ? num1 : num2); ; lcm++) {
        if (lcm % num1 == 0 && lcm % num2 == 0) {
            printf("%d\n", lcm);
            break;
        }
    }
}