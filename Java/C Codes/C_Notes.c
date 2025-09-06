#include<stdio.h>
void main()
{
        int first, second, *p, *q, sum;

       printf("Enter two integers to add\n");
       scanf("%d%d", &first, &second);

       p = &first;
       q = &second;

       sum = *p + *q;

       printf("Sum of the numbers = %d\n", sum);


//question
    
    // int a=1,b=2;
    // if((a==b) < printf("hello"))
    // {
    //     printf("world");
    // }
    // else
    // {
    //     printf("byee");
    // }


//question 2 swaping using xor function

    int a=10,b=20;
    a=a^b;
    b=a^b;
    a=a^b;
    printf("%d %d",a,b);


//Q.

    // int a=10;
    // int x=printf("%d",a);
    // printf("%d",x);

//Q.
    // char a='AB';//multi charater not allow but it reads from last charaters and return B
    // printf("%c",a);


//Q. Maximum value in an array
    // int n;
    // printf("Enter size of array ");
    // scanf("%d",&n);//take input size of array

    // int arr[n],i;
    // for(i=0;i<n;i++)//Forloop for take input from user 
    // {
    //     printf("Enter the values: ");
    //     scanf("%d",&arr[i]);
    // }
    
    // int max=arr[0];
    // int j;
    // for(j=0;j<n;j++)
    // {
    //     if(max < arr[j])//Forloop for comparing the max value 
    //     {
    //         max = arr[j];
    //     }
    // }
    // printf("Maximum value is %d",max);


//Q. 

    // char str1[]={'h','e','l','l','o'};
    // char str2[]={'h','e','l','l','o','\0'};
    // char str3[]={"hello"};
    // printf("%s\n",str1);    //%s use for String variables
    // printf("%s\n",str2);
    // printf("%s\n",str3);


//Q.

    // printf("includehelp.com\rok\n");//\r used for return from staring line
    // printf("includehelp.com\b\b\bok\n");//\b used for backspace 

//Q.
    // int a=0;
	// a=5||2|1;
	// printf("%d",a);
    

//Q.
    // int i=50;
	// const int x=i++;

	// printf("x= %d",++x);// error


//Q.
    // int i=23;
    // ;
    // printf("%d",i);//23 
    // ;

//Q.WAP to convert decimal number into binary



}
