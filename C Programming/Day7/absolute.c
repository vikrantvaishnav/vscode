#include<stdio.h>
#include<conio.h>
int main(){

    int num;

    scanf("%d",&num);

    if(num<0){
        printf("%d", -(num));
        return 0;
    }
    printf("%d", num);

    
}