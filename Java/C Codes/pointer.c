#include<stdio.h>
#include<stdlib.h>
// struct Node
// {
// 	int no;
// 	struct Node *link;
// }*s1,*s2,*s3;
//  void main()
//  {
//  	s1=(struct Node *)malloc(sizeof(struct Node));
//  	s1->no=5;
//  	s1->link=(struct Node *)malloc(sizeof(struct Node));
// 	s1->link->no=15;
// 	s2=(struct Node *)malloc(sizeof(struct Node));
// 	s2->no=20;
// 	s1->link->link=s2;
// 	s2->link=(struct Node *)malloc(sizeof(struct Node));
// 	s2->link->no=30;
// 	s2->link->link=(struct Node *)malloc(sizeof(struct Node));
//     s2->link->link->no=10;
//     s3=(struct Node *)malloc(sizeof(struct Node));
//     s3->no=25;
// 	s2->link->link->link=s3;
// 	s3->link=s1;
// 	   printf("%d",s2->link->link->link->link->no);
// 	printf("%d",s3->link->link->link->link->link->no);
//    printf("%d",s1->link->link->link->no);


//  }



 #include <iostream>

using namespace std;

class Demo{
    public:
        int a, b;
};

int main()
{
    Demo s1, s2, s3;
    s1.a = 5;
    s1.b = 3;
    
    s2.a = 7;
    s2.b = 6;
    
    s3.a = s1.a + s2.a;
    s3.b = s1.b + s2.b;
    
    cout<<s3.a<<" ";
    cout<<s3.b;
}