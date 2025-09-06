#include<stdio.h>

void main(){
    int num,sum=0;
    scanf("%d",&num);

    printf("1 to %d odd number is:",num);

    for(int i=1;i<num;i++){
        if(i%2!=0){
            sum+=i;
            printf("%d ",i);
        }
    }
    printf("\n");
    printf("sum of number is: %d",sum);
}