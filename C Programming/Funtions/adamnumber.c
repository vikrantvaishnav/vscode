#include<stdio.h>


int reverse(int num){
    int rev=0;

    while(num){
        rev= rev*10+(num%10);
        num= num/10;
    }
    return rev;
}

int square(int num){

    int squr= num*num;

    return squr;
}
void main(){
    int num=12;
    
    int squar = square(num);
    printf("Square of %d is %d \n",num,squar);
    int revs= reverse(num);
    printf("reverse of %d is %d\n",num, revs);
    int revsquar = square(revs);
    printf("squar of revrse %d is %d\n",revs,revsquar);

    printf("%d %d",squar,revs);

    

}