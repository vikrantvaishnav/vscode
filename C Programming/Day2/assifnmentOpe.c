#include<Stdio.h>
#include<conio.h>

void main(){
    int a=5;
    int c;

    c=a;
    printf("c = %d\n", c);
    c+=a;
    printf("c = %d\n", c);
    c-=a;
    printf("c = %d\n", c);
    c*=a;
    printf("c = %d\n", c);
    c/=a;
    printf("c = %d\n", c);
    c%=a;
    printf("c = %d\n", c);

    getch();


}