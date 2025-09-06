#include<stdio.h>
#include<conio.h>

int main(){
    int price;
    scanf("%d",&price);

    (price<1000)?printf("total amount =%d",price):((price>=1000&&price<=5000)?printf("total amount including 5%% discount =%d", price - (price * 5 / 100)):printf("total amount including 10%% discount =%d", price - (price * 10 / 100)));

    return 0;
    
}