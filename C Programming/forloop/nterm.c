#include<stdio.h>

void main(){
    int num,sum=0;

    scanf("%d",&num);

    for(int i=1;i<=num;i++){
        sum = sum*10+i;
        for(int j=1;j<=i;j++){

            printf("%d",1);
            


        }
        if(i<num){
            printf("+");
        }
        
    }
    printf("\nThe sum is:%d",sum);
}