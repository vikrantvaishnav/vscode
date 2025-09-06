#include<stdio.h>

void main(){
    int num,power;
    scanf("%d%d",&num,&power);
    int sum=num;
    for(int i=power;i>1;i--){

        sum*=num;
    }
    printf("%d",sum);
}