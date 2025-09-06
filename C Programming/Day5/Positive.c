#include<conio.h>
#include<stdio.h>

int main(){
    int num;

    scanf("%d",&num);

    (num==0)?printf("Zero"):((num>0)?printf("Positive Number"):printf("Negative Number"));

    return 0;
}