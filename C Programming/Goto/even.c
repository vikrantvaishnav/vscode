#include<stdio.h>

int main(){
    int num ;
    scanf("%d",&num);

    if(num<=0){
        printf("Invalid Input");
        return 0;
    }
    int temp=2;
    start:
    if(temp<=num){
        if(temp%2==0){

            printf("%d ",temp);
            temp++;
            goto start;
        }
        temp++;
        goto start;

    }
    return 0;
}