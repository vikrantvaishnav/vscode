#include<stdio.h>
#include<conio.h>

void main(){
    int sub1,sub2,sub3,sub4,sub5;

    printf("enter the marks of 5 subjects:");
    scanf("%d,%d,%d,%d,%d\n",&sub1,&sub2,&sub3,&sub4,&sub5);

    int count =0;
    sub1>=35&&count++;
    sub2>=35&&count++;
    sub3>=35&&count++;
    sub4>=35&&count++;
    sub5>=35&&count++;

    printf("Pass in %d subjects and fail in %d subjects.",count,(5-count));
    

   
}