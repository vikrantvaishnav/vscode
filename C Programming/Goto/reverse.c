#include<stdio.h>

int main(){
    int num;

    scanf("%d",&num);

    if(num<=0){
        printf("Invalid Input");
        return 0;
    }
    int rev=0;
    start:
    if(num==0){
        printf("%d",rev);
        return 0;
    }

    rev = (rev*10)+ num%10;
    num = num/10;
    goto start;
}