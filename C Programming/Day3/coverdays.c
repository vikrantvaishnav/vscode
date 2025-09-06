#include<stdio.h>
#include<conio.h>

void main(){
    int days;
    printf("Enter number of days: ");
    scanf("%d", &days);
    
    int years = days / 365;
    int remenring_days = days% 365;
    int months = remenring_days / 30;
    remenring_days = remenring_days % 30;
   

    printf("Years: %d, Months: %d, Days: %d\n", years, months, remenring_days);
}

