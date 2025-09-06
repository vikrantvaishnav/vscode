#include<stdio.h>
#include<stdlib.h>

int main(){
    int choice, quty;
    printf("Menu:-\n");
    printf("1. Pizza - $10 \n2. Burger - $7\n3. Pasta - $8\n4. Salad - $5\n5. Exit\n\n");

    printf("Enter your choice:");
    scanf("%d",&choice);

    if(choice == 5){
        printf("thank you");
        exit(0);
    }

    printf("Enter the quantity:");
    scanf("%d",&quty);

    switch(choice){
        case 1: printf("You selected Pizza. Price: $ %d",10*quty);
        break;

        case 2: printf("You selected Burger. Price: $ %d",7*quty);
        break;

        case 3: printf("You selected Pasta. Price: $  %d",8*quty);
        break;

        case 4: printf("You selected Salad. Price: $ %d",5*quty);
        break;


    }


}