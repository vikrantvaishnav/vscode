#include<stdio.h>
#include<conio.h>

void main(){
    int cost= 3500;
    float sellingPrice,Profit,vat,serviceCharges;

    sellingPrice = 3500+(27*cost)/100;
    printf("sellingPrice =%.2f\n",sellingPrice);

    Profit = sellingPrice - cost;
    printf("Profit =%.2f\n",Profit);

    vat= (12.7/100)*sellingPrice;
    printf("VAT :%.2f\n",vat);

    serviceCharges = (3.87/100)*sellingPrice;
    printf("Service Charges: %.2f",serviceCharges);

    // sellingPrice = cost+Profit+vat+serviceCharges;
    // printf("sellingPrice =%f\n",sellingPrice);
}