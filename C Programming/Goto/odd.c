// #include<stdio.h>

// int main(){
//     int num ;
//     scanf("%d",&num);

//     if(num<=0){
//         printf("Invalid Input");
//         return 0;
//     }
//     int temp=1;
//     start:
//     if(temp<=num){
//         if(temp%2==0){

            
//             temp++;
//             goto start;
//         }
//         printf("%d ",temp);
//         temp++;
//         goto start;

//     }
//     return 0;
// }









#include <stdio.h>
int main() {
int num = 20;
switch (printf("%d", num)) {
case 1: printf(" Case 1");
break;
case 2: printf(" Case 2");
break;
default: printf(" Default case");
}
return 0;
}