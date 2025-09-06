#include<stdio.h>

int main(){
    int num;

    scanf("%d",&num);

    if(num<0){
        printf("Invalid Input");
    }
    int temp =0;
    start:
    if(num<=0){
        printf("%d",temp);
        return 0;
    }
    num = num/10;
    temp++;
    goto start;
}