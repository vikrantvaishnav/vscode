#include<stdio.h>
#include<conio.h>

int main(){
    int num1,num2;
    char ch;

    scanf("%d %d %c",&num1,&num2,&ch);

    (ch=='+')?(printf("%d",num1+num2)):((ch=='-')?printf("%d",num1-num2):((ch=='*')?printf("%d",num1*num2):((ch=='/')?printf("%d",num1/num2):(printf("%d",num1%num2)))));
}