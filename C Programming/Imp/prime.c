#include<stdio.h>
#include<stdlib.h>

// int main(){
//     long num;
//     scanf("%ld",&num);

//     if(num<0){
//         printf("Invalid input. Enter a positive integer.");
//         exit(0);
//     }
//         int flag =1;
//     for(int i=2;i*i<=num;i++){
        
//         if(num%i==0){
//             printf("%d is not a prime number.",num);
//             flag=0;
//             exit(0);
//         }

//     }
//     if (flag){
//         printf("%d is a prime number.",num);
        
//     }
    
// }




#include<stdio.h>
#include<stdlib.h>

int main(){
    int num;
    scanf("%d",&num);

    if(num<0){
        printf("Invalid input. Enter a positive integer.");
        exit(0);
    }

    for(int i=2;i<num/2;i++){
        if(num%2==0){
            printf("%d is not a prime number.",num);
            exit(0);
        }

    }
    printf("%d is a prime number.",num);
}