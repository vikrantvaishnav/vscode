#include<stdio.h>

int main(){
    int num;
    scanf("%d",&num);
    int temp=0;
    while(num){
        temp+=num%10;
        num/=10;
    }
    printf("%d",temp);
}