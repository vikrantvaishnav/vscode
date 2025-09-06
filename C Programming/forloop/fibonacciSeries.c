#include<stdio.h>

void main(){
    int num,a=0,b=1;
    scanf("%d",&num);

    printf("%d %d ",a,b);

    for(int i=0;i<num-2;i++){

        int c = a+b;
        printf("%d ",c);
        
        a=b;
        b=c;
    }
}