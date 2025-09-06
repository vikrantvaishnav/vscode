#include<stdio.h>
#include<conio.h>

int main(){

    float salary;
    char ch;
    scanf("%c %f",&ch,&salary);

    (ch=='M')?printf("Final Salary with 10%% bonus = %.2f",salary+(salary*10/100)):(ch=='H')?printf("Final Salary with 5%% bonus = %.2f",salary+(salary*5/100)):printf("Invalid Employee Type. Salary unchanged = %.2f",salary);
}
