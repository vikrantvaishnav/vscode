#include<stdio.h>
#include<conio.h>

void main(){
    int a;
    int b;
    printf("enter the vale of a and b");
    scanf("%d%d",&a,&b);

    a= a+b;
    b = a-b;
    a= a-b;


    printf("a = %d b = %d",a,b);
}