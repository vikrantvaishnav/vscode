#include<stdio.h>

int main(){
    int id ,sub1,sub2,sub3,sub4,sub5,sub6;
    char name[10];

    
    printf("Enter id, name, sub1, sub2, sub3, sub4, sub5, sub6:\n");
    scanf("%d %s %d %d %d %d %d %d",&id,name,&sub1,&sub2,&sub3,&sub4,&sub5,&sub6);

    int avg = (sub1+sub2+sub3+sub4+sub5+sub6)/6;

    if(avg>=80){
        printf("Distinction");
    }
    else if(avg>=60){
        printf("1st");
    }
    else if(avg>=50){
        printf("2nd");
    }
    else if(avg>=35){
        printf("3rd");
    }
    else{
        printf("Fail");
    }
    
    return 0;
}