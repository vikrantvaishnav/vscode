#include<stdio.h>

int main(){
    int num;
    scanf("%d",&num);

    while(num){
        printf("%d\n",num%10);
        num/=10;
    }
}