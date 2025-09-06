#include<stdio.h>
#include<conio.h>

void main(){

    int a ;
    printf("enter a number");
    scanf("%d", &a);

    // int result = a%10>=5?(a/10+1)*10:a/10*10;

    int result = a%10>=5&&printf("%d \n",(a/10+1)*10)||printf("%d \n",a/10*10);
    // printf("result is %d", result);
}