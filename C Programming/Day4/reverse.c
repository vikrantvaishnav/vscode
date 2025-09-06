#include<stdio.h>
#include<conio.h>

void main(){
    int number,reverse=0;
    printf("enter a number:");
    scanf("%d",&number);

    int temp = number%10;
    reverse= reverse*10+temp;
    number = number/10;


    temp = number%10;
    reverse= reverse*10+temp;
    number = number/10;

    temp = number%10;
    reverse= reverse*10+temp;
    number = number/10;


    printf("reverce %d",reverse);


}