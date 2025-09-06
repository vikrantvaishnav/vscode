#include<stdio.h>

int main(){
    int num;
    scanf("%d",&num);
    int temp=1;
    while(num){
        temp*=num;
        num--;
    }
    printf("%d",temp);
}