#include <stdio.h>

int main() {
    int num;
    scanf("%d", &num);

    if (num == 0) {
        printf("invalid!.");
        return 0;
    }

    int temp;

    if (num > 0) {
        printf("1 to %d even numbers are: ", num);
        temp = 2;   
    posLoop:
        if (temp > num){
            return 0;
        };
        printf("%d ", temp);
        temp += 2;
        goto posLoop;-
    } else {
        printf("1 to %d even numbers are: ", num);
        temp = -2;  
    negLoop:
        if (temp < num){
            return 0;
        };
        printf("%d ", temp);
        temp -= 2;
        goto negLoop;
    }


    return 0;
}
