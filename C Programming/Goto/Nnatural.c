#include<stdio.h>

int main(){
    int num;

    scanf("%d",&num);
    if(num==0){
        printf("Invalid Input.");
        return 0;
    }

    start:
    if(num<=0){
        return 0;
    }
    printf("%d ",num );
    num--;
    goto start;

    return 0;


}