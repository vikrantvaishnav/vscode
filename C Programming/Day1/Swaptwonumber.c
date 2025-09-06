#include<stdio.h>
#include<conio.h>

void main(){
    int a;
    int b;
    printf("enter the vale of a and b");
    scanf("%d%d",&a,&b);

    int temp = a;
    a = b;
    b= temp;

    printf("a = %d b = %d",a,b);

}