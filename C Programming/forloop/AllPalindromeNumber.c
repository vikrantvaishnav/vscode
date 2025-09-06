#include<stdio.h>
void main(){
    int num;
    scanf("%d",&num);

    for(int i=1;i<=num;i++){
        int rev=0;
        for(int j=i;j>0;j/=10){
            rev = rev*10+(j%10);
        }
        if(rev==i){
            printf("%d ",i);
        }
    }
}