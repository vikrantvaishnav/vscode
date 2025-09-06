#include<stdio.h>

int main(){
    int num, n;
    scanf("%d %d", &num, &n);

    for(int i = 1; i <= n; i++){
        printf("%d ", num * i);
    }

    return 0;
}