#include<stdio.h>
#include<conio.h>

void main(){
    int seconds;
    printf("Enter number of seconds: ");
    scanf("%d", &seconds);

    int hours = seconds / 3600;
    int remaining_seconds = seconds % 3600;
    int minutes = remaining_seconds / 60;
    remaining_seconds %= 60;

    printf("Hours: %d, Minutes: %d, Seconds: %d\n", hours, minutes, remaining_seconds);
}
