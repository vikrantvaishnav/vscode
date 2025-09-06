#include<stdio.h>

void main(){
    int a ,b,c;
    printf("enter two numbers:");
    scanf("%d %d",&a,&b);

    printf("CHOICE\n");
    printf("----------------------\n");
    printf("1.smaller\n");
    printf("2.Bigger\n");
    printf("----------------------\n");
    printf("Enter ur option:");
    scanf("%d",&c);

    if(c==1){
        if(a<b){
            printf("%d is smaller",a);
        }
        else{
            printf("%d is smaller",b);
        }
    }
    else{
        if(a>b){
            printf("%d is bigger",a);
        }
        else{
            printf("%d is bigger",b);
        }
    }

}