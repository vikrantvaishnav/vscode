#include<stdio.h>

int main(){
    char name[20],vehiclename[20];
    int vehicletype,vehicleage,choice ;
    float bill;

 start:
    printf("Enter owner's name: ");
    scanf("%s",name);
    printf("\n");
    printf("Enter vehicle name: ");
    scanf("%s",vehiclename);
    printf("\n");
    printf("Enter vehicle type (2 for 2-wheeler, 3 for 3-wheeler, 4 for 4-wheeler): ");

    scanf("%d",&vehicletype);
    printf("\n");
    if(vehicletype<2 && vehicletype>4){
        printf("This service center does not accept vehicles other than 2-wheelers, 3-wheelers, and 4-wheelers.");
        goto start;
    }
    printf("Enter vehicle age in months:");
    scanf("%d",&vehicleage);
    printf("\n");
    printf("\n");
    
    if(vehicleage <=8){
        printf("Your vehicle service will be done after a while.");
    }
    else if(vehicleage>8){
         printf("Select the issue: \n-> Enter 1 for tire problem \n-> Enter 2 for fuel problem \n-> Enter 3 for engine issue \n-> Enter 4 for general services\n Enter your choice: ");
    scanf("%d",&choice);
    printf("\n");
    printf("\n");
    if(choice ==1){
        int tires;
        printf("How many tires are you facing issues with?");
        scanf("%d",&tires);
        bill = tires*400;

        printf("----- Bill Format ----- \n-> Name of the owner: %s \n-> Name of the bike: %s \n-> Issue: Tire Problem \n-> Bill: Rs. %.2f",name,vehiclename,bill);

    }
    else if( choice == 2){

        bill = 1500;
        printf("----- Bill Format ----- \n-> Name of the owner: %s \n-> Name of the bike: %s \n-> Issue: Fule Problem \n-> Bill: Rs. %.2f",name,vehiclename,bill);
    }
    else if( choice == 3){
        bill = 5000;
        printf("----- Bill Format ----- \n-> Name of the owner: %s \n-> Name of the bike: %s \n-> Issue: Engine Problem \n-> Bill: Rs. %.2f",name,vehiclename,bill);
    }
    else if(choice == 4){
        bill = 1000;
        printf("----- Bill Format ----- \n-> Name of the owner: %s \n-> Name of the bike: %s \n-> Issue: General Problem \n-> Bill: Rs. %.2f",name,vehiclename,bill);
    }
    }
    

   

    
}