#include<stdio.h>

void main(){
    int num;
    scanf("%d",&num);
    printf("The divisors of %d are: ",num);

    for(int i=1;i<=num;i++){

        if(num%i==0){
            printf("%d ",i);
        }
    }
}