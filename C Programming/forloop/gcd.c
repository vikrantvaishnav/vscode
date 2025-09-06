#include<stdio.h>

int main(){
    int num1 ,num2 ,fact=0;

    scanf("%d%d",&num1,&num2);
    printf("The GCD of %d and %d is: ",num1,num2);

    for(int i=1;i<=num1&&i<=num2;i++){
        if(num1%i==0 && num2%i==0){
            fact=i;

         }
        
    }
    printf("%d",fact);
}