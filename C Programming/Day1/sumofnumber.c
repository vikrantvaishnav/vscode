#include<stdio.h>
#include<conio.h>
void main(){
    int number = 65;
    int ans=0;

   int temp = number%10;
    ans += temp;
    temp = number/10;
    ans += temp;


    printf("Sum of number:%d",ans);
}