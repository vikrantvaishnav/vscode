#include<stdio.h>
#include<conio.h>

void main(){
    int a, b, sum, diff, prod, quot , modulus;
    
    printf("Enter two integers: ");
    scanf("%d %d", &a, &b);
    
    sum = a + b;
    diff = a - b;
    prod = a * b;
    quot = a / b;
    modulus = a % b;

    printf("Sum of %d + %d = %d\n",a,b, sum);
    printf("Difference of %d - %d = %d\n",a,b, diff);
    printf("Product of %d * %d = %d\n",a,b, prod);
    printf("Quotient of %d / %d = %d\n",a,b, quot);
    printf("Modulos of %d %% %d = %d\n",a,b, modulus);

    getch();
}