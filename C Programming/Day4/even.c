#include<stdio.h>
#include<conio.h>

void main(){
    int number;
    printf("enter a number");
    scanf("%d",&number);

    number%2==0&&printf("even")||printf("odd");
}