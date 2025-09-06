#include<stdio.h>

int main(){
    int num ,sum=0;
    scanf("%d",&num);
    int num1=num;

    for(int i=1;num;i++){
        int temp = num%10;
        num/=10;
        int fact=1;
        for(int i =temp;i>0;i--){
            fact*=i;
            
        }
        sum += fact;
    }
    if(sum==num1){
        printf("%d is a strong number.",num1);
    }
    else{
        printf("%d is not a strong number.",num1);
    }
}