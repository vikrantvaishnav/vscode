#include<stdio.h>
#include<conio.h>

void main(){
    int a= 5;
    int b= 5;
    int c = 10;

    printf("(%d == %d) && (%d > %d) is %d\n", a, b, c, b, (a == b) && (c > b));
    printf("(%d == %d) && (%d < %d) is %d\n", a, b, c, b, (a == b) && (c < b));
    printf("(%d == %d) || (%d < %d) is %d\n", a, b, c, b, (a == b) || (c < b));
    printf("(%d != %d) || (%d < %d) is %d\n", a, b, c, b, (a != b) && (c < b));
    printf("!(%d != %d) is %d\n", a, b, !(a != b));
    printf("!(%d == %d) is %d\n", a, b, !(a == b));

}