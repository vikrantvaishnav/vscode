#include<stdio.h>
#include<math.h>

int main(){
    int num ,sum=0;
    scanf("%d",&num);
    int neon = pow(num,2);

    do{
        sum += neon%10;
        neon/=10;

    }while(neon);
    if(sum==num){
        printf("%d is neon number",num);
    }
    
    else{
        printf("Not a neonn number");
    }


}