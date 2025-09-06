#include<stdio.h>

int main(){
    int sub1,sub2,sub3,sub4,sub5;

    scanf("%d%d%d%d%d",&sub1,&sub2,&sub3,&sub4,&sub5);

    int avg = (sub1+sub2+sub3+sub4+sub5)/5;
    float Percentage = ((float)sub1+sub2+sub3+sub4+sub5)/5;

    int total= sub1+sub2+sub3+sub4+sub5;

    if(sub1>100||sub2>100||sub3>100||sub4>100||sub5>100){
        printf("Invalid");
    }

    switch(avg){
        case 90 ... 100: printf("Total Marks: %d\nPercentage: %.2f%%\nGrade: A",total,Percentage);
            break;

        case 75 ... 89: printf("Total Marks: %d\nPercentage: %.2f%%\nGrade: B",total,Percentage);
            break;

        case 50 ... 74: printf("Total Marks: %d\nPercentage: %.2f%%\nGrade: C",total,Percentage);
            break;

        case 35 ... 49: printf("Total Marks: %d\nPercentage: %.2f%%\nGrade: D",total,Percentage);
            break;

        default: printf("Fail");
    }
}