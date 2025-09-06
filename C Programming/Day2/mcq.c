// #include <stdio.h>
// int main() {
//     int a = 5, b = 3, c = 1;
//     int result = a * (b + c++) / (--b);
//     printf("%d\n", result);
//     return 0;
// }



// #include <stdio.h>
// int main() {
//     int x = 5, y = 2, z;
//     z = x / y * x % y;
//     printf("%d\n", z);
//     return 0;
// }




// #include <stdio.h>
// int main() {
//     int a = 5, b = 5, c = 5;
//     int x, y;

//     x = ++a * 2 - 1;
//     y = b++ * 2 - 1;
//     c *= 2 - 1;

//     printf("%d %d %d\n", x, y, c);
//     return 0;
// }





// #include <stdio.h>
// int main()
// {
//     int a = 8;
//     double b = 2.6;
//     int c;
//     c = a + b;
//     printf("%d", c);
//     return 0;
// }




// #include <stdio.h>
// int main()
// {
//     int x = 4, y = 2;
//     x /= x / y;
//     printf("%d\n", x);
//     return 0;
// }







// #include <stdio.h>
// int main()
// {
//   int a,b=2,c;
//   a=2*(b++);
//   c=2*(++b);
//   printf("a=%d, b=%d, c=%d",a,b,c);
//   return 0;
// }





//   #include <stdio.h>
//   void main()
//   {   
//     int x=(20 || 40 ) && (10);
//     printf("x= %d",x);
//   }




// #include<stdio.h>
//   void main() {
//   int i = 0, j = 1, k = 2, m;
//   m = i++ || j++ || k++;
//   printf("%d %d %d %d", m, i, j, k);
//   return 0;
//   } 





// #include<stdio.h>
// int main()
// {
//   int a=3, b=9;
//   printf("%d", ++(a*b+1));
//   return 0;
// }





// #include<stdio.h>
// int main() {
// int a = 5;
// int b = 4;
// a += b % a;
// printf("%d",a);
// return 0;
// }



// #include<stdio.h>
// int main() {
// int a = 5;
// int b = 10;
// int c = 15;
// int d = 2;   
// int result = a++ * ++b - c-- / d++;
// printf("%d %d %d %d",a,b,c,result);
// return 0;
// }






// #include<stdio.h>
// int main() {
// int x = 3;
// int y = 2;
// int z = x++ * x * --y - y--;
// printf("%d %d %d",x,y,z); 
// return 0;
// }





// #include<stdio.h>
// int main()
// {
// int i =10;
// i=!i>14;
// printf("%d",i);
// return 0;
// }



// #include<stdio.h>
// int main()
// {
// int i = 10;
// i++;
// i * i;
// printf("%d\n",i);
// return 0;
// }



// #include<stdio.h>
// int main()
// {
// int a=4,b,c;
// b = --a;
// c = a--;
// printf("%d %d %d",a,b,c);
// return 0;
// }




// #include<stdio.h>
// int main()
// {
// int x, y, z;
// x = 9 > 8 > 7;
// y = 9 > 8 > 0;
// z = 9 > 8 > 1;
// printf("%d %d %d", x, y, z);
// return 0;
// }


// #include<stdio.h>
// int main()
// {
// int a=-1, b=1, c, d;
// c = !a && b;
// d = !a || b;
// printf("%d %d %d %d",a,b,c,d);
// return 0;
// }



// #include<stdio.h>
// int main() {
// int x = 5;
// float y = 3.5;
// int result = x + (int)y;
// printf("Result: %d\n", result);
// return 0;
// }




#include<stdio.h>
int main() {
printf("%d ", 2 + 3 * 4 + 5 == 45);
printf("%d ", 2 + 3 * 4 + 5 == 19);
printf("%d ", (2 + 3) * (4 + 5) == 45);
return 0;
}



