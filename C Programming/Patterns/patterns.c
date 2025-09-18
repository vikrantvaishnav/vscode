#include<stdio.h>

/*
    1   2   3   4   5   
    6   7   8   9   10
    11  12  13  14  15
    16  17  18  19  20

*/
// int main(){
//     int num=1;
//     for(int i=1;i<=4;i++){
//         for(int j=1;j<=5;j++){
//             printf("%-4d",num++);
//         }
//         printf("\n");
//     }
// }










/* 
    1   3   5   7   9   
    11  13  15  17  19
    21  23  25  27  29
    31  33  35  37  39
*/
// void main(){
//     int num=1;
//     for(int i=0;i<4;i++){
//         for(int j=0;j<5;j++){
//             printf("%-4d",num);
//             num+=2;
//         }
//         printf("\n");
//     }
// }










/*  
    2   4   6   8   10  
    12  14  16  18  20
    22  24  26  28  30
    32  34  36  38  40
*/
// void main(){
//     int num=2;
//     for(int i=0;i<4;i++){
//         for(int j=0;j<5;j++){
//             printf("%-4d",num);
//             num+=2;
//         }
//         printf("\n");
//     }
// }










/*
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1

*/
// void main(){
//     for(int i=0;i<4;i++){
//         for(int j=5;j>=1;j--){
//             printf("%2d",j);
//         }
//         printf("\n");
//     }
// }








/*
    1 1 2 1 3 1
    1 2 2 2 3 2
    1 3 2 3 3 3
    1 4 2 4 3 4
    1 5 2 5 3 5
*/
// void main(){
//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=6/2;j++){
//             printf("%2d%2d",j,i);
//         }
//         printf("\n");
//     }
// }








/*
    1  2  3  4  5  
    2  4  6  8  10
    3  6  9  12 15
    4  8  12 16 20
    5  10 15 20 25
*/
// void main(){
//     for(int i=1;i<=5;i++){
//         int num=i;
//         for(int j=1;j<=5;j++){
//             printf("%-3d",num);
//             num+=i;
//         }
//         printf("\n");
//     }
// }






/*
    1  2  3  4  5
    2  3  4  5  6
    3  4  5  6  7
    4  5  6  7  8
    5  6  7  8  9
*/
// void main(){
//     for(int i=1;i<=5;i++){
//         int num=i;
//         for(int j=1;j<=5;j++){
//             printf("%3d",num++);
//         }
//         printf("\n");
//     }
// }










/*
    5  10 15 20 25 
    4  9  14 19 24
    3  8  13 18 23
    2  7  12 17 22
    1  6  11 16 21

*/
// void main(){
//     int n=5;
//     for(int i=n;i>=1;i--){
//         int num=i;
//         for(int j=1;j<=n;j++){
//             printf("%-3d",num);
//             num+=5;
//             // printf("%-4d", i + (j - 1) * n);
//         }
//         printf("\n");
//     }
// }








/*
    0 1 0 1 0 
    1 0 1 0 1
    0 1 0 1 0
    1 0 1 0 1
    0 1 0 1 0
*/
// void main(){
//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=5;j++){
//             if((i+j)%2==0){
//                 printf("0 ");
//             }
//             else{
//                 printf("1 ");
//             }
//         }
//         printf("\n");
//     }
// }







/*
    1 0 0 0 1 
    0 1 0 1 0
    0 0 1 0 0
    0 1 0 1 0
    1 0 0 0 1
*/
// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i==j||i+j==n+1){
//                 printf("1 ");
//             }
//             else{
//                 printf("0 ");
//             }
//         }
//         printf("\n");
//     }
// }









/*
    1   2   3   4   5
    10   9   8   7   6
    11  12  13  14  15
    20  19  18  17  16
    21  22  23  24  25
*/
//logic1
// void main(){
//     int n=6;
//     int num=1;
//     for(int i=1;i<=n;i++){
//         if(i%2==0){
//             int start=i*n;
//             int end =num;
//             for(int j=start;j>=end;j--){
//                 printf("%4d",j);
//             }
//              printf("\n");
//         }
//         else{             
//              for(int j=1;j<=n;j++){
//                 printf("%4d",num++);
//             }
//             printf("\n");
//         }
//         if(i%2==0){
//             num= i*n+1;
//         }
//     }
// }



//logic2
// void main(){
//     int n=5;
//     int num=1;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i%2==0){
//                 printf("%4d",--num);
//             }
//             else{
//                 printf("%4d",num++);
//             }
//         }
//         num +=5;
//         printf("\n");
//     }
// }








/*
    1   6  11  16
    2   7  12  17
    3   8  13  18
    4   9  14  19
    5  10  15  20
*/

// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         int num=i;
//         for(int j=1;j<n;j++){         
//             printf("%4d",num);
//             num+=5;
//         }
//         printf("\n");
//     }
// }











/*
    A  B  C  D
    E  F  G  H
    I  J  K  L
    M  N  O  P
*/

// void main(){
//     char ch ='A';
//     int n=4;
//     for(int i=0;i<n;i++){
//         for(int j=1;j<=n;j++){
//             printf("%3c",ch++);
//         }
//         printf("\n");
//     }
// }











/*
    A  B  C  D
    B  C  D  E
    C  D  E  F
    D  E  F  G
*/

// void main(){
//     char ch ='A';
//     int n=4;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             printf("%3c",ch+j);
//         }
//         printf("\n");
//         ch++;
//     }
// }











/*
    E  J  O  T  Y
    D  I  N  S  X
    C  H  M  R  W
    B  G  L  Q  V
    A  F  K  P  U
*/



// void main(){
//     int n=5;
//     for(char ch=64+n;ch>='A';ch--){
//         char temp = ch;
//         for(int i=0;i<n;i++){
//             printf("%3c",temp);
//             temp+=5;
//         }
//         printf("\n");
//     }
// }












/*
    *
    **
    ***
    ****
    *****
*/



// void main(){
//     int  n=5;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<=i;j++){
//             printf("*");
//         }
//         printf("\n");
//     }
// }











/*
    1
    2  3
    4  5  6
    7  8  9 10
*/

// void main(){
//     int n=5;
//     int num=1;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<i;j++){
//             printf("%3d",num++);
//         }
//         printf("\n");
//     }
// }














/*
    2
    2  4
    2  4  6
    2  4  6  8
    2  4  6  8 10
*/
// void main(){
//     int n=5;
//     int num=2;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             printf("%3d",num*j);
//         }
//         printf("\n");
//     }
// }














/*
    1
    1  1
    1  2  1
    1  2  3  1
    1  2  3  4  1
    1  1  1  1  1  1
*/
// void main(){
//     int n=6;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             if(i==j||i==n){
//                 printf("%3d",1);
//             }
//             else{
//                 printf("%3d",j);
//             }
//         }
//         printf("\n");
//     }
// }















/*
    1
    1  2
    2  3  4
    4  5  6  7
    7  8  9 10 11
*/

// void main(){
//     int n=5;
//     int num=1;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             printf("%3d",num++);
//         }
//         num--;
//         printf("\n");
//     }
// }




/*

*****
 ****
  ***
   **
    *
*/


// void main(){
//     int n=5;    
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<i;j++){
//             printf(" ");
//         }
//         for(int j=5;j>=i;j--){
//             printf("*");
//         }
//         printf("\n");
//     }
// }


// int main() {
// 	int n = 5;
// 	for(int i = 1;i<=n;i++) {
// 		for(int j = 1;j<=n;j++) {
// 			if(j>=i) {
// 				printf("%3c",'*');
// 			}else {
// 				printf("%3c",' ');
// 			}
// 		}
// 		printf("\n");
// 	}
// }









/*
         *
       * *
     * * *
   * * * *
 * * * * *
*/




// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i+j>=n+1){
//                 printf("%3c",'*');
//             }
//             else{
//                 printf("%3c",' ');
//             }
//         }
//         printf("\n");
//     }
// }


// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf("  ");
//         }
//         for(int j=1;j<=i;j++){
//             printf(" *");
//         }
//         printf("\n");
//     }
// }















/*
    *****
    ****
    ***
    **
    *
*/

// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i+j<=n+1){
//                 printf("*");
//             }
//             else{
//                 printf(" ");
//             }
//         }
//         printf("\n");
//     }
// }


// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=i;j<=n;j++){
//             printf("*");
//         }
//         printf("\n");
//     }
// }















/*
          * 
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
*/

// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=n;j>=i;j--){
//             printf("  ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//             printf("* ");
//         }
//         printf("\n");
//     }
// }

// int main() {
// 	int n = 5;
// 	int x = n, y = n;
// 	for(int i = 1;i<=n;i++) {
// 		for(int j = 1;j<=n*2-1;j++) {
// 			if(j<x || j>y) {
// 				printf("%2c",' ');
// 			}else {
// 				printf("%2c",'*');
// 			}
// 		}
// 		x--;
// 		y++;
// 		printf("\n");
// 	}
// }















/*
* * * * * * * * * 
  * * * * * * *
    * * * * *
      * * *
        *
*/

// void main(){
//     int n=5;
//     for(int i=5;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             printf("  ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//             printf("* ");
//         }
//         printf("\n");
//     }
// }
















/*
         *        
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
*/

// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf("  ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//             printf(" *");
//         }
//         printf("\n");
//     }
//     for(int i=n-1;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             printf("  ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//             printf(" *");
//         }
//         printf("\n");
//     }
// }


// void main(){
//     int n = 5;
// 	int N = n*2-1;
// 	int x = n, y = n;                
// 	for(int i = 1;i<=N;i++) {         
// 		for(int j = 1;j<=N;j++) { 
// 			if(j<x || j>y) {
// 				printf("%2c",' ');
// 			}else {
// 				printf("%2c",'*');
// 			}
// 		}
// 		if(i<n) {
// 		x--;
// 		y++;
// 	    }else {
// 	    	x++;
// 	    	y--;
// 		}
// 		printf("\n");
// 	}
// }
















/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/


// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//            if(j==1||j==2*i-1){
//             printf("*");
//            }else{
//             printf(" ");
//            }
//         }
//         printf("\n");
//     }
//     for(int i=n-1;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//            if(j==1||j==2*i-1){
//             printf("*");
//            }else{
//             printf(" ");
//            }
//         }
//         printf("\n");
//     }    
// }













/*
    0 0 0 0 1
    0 0 0 1 1
    0 0 1 1 1
    0 1 1 1 1
    1 1 1 1 1
*/

// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i+j>=n+1){
//                 printf(" 1");
//             }
//             else{
//                 printf(" 0");
//             }
//         }
//         printf("\n");
//     }
// }

















/*
    1 
    1 2
    1   3
    1     4
    1 2 3 4 5
*/

// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             if(j==1||i==j||i==n){
//                 printf("%d ",j);
//             }
//             else{
//                 printf("  ");
//             }
//         }
//         printf("\n");
//     }
// }












/*
    0 
    0 1
    0 1 1
    0 1 1 2
    0 1 1 2 3
    0 1 1 2 3 5
*/

// void main(){
//     int n=6;
//     for(int i=1;i<=n;i++){
//         int a=0,b=1,sum=0;
//         for(int j=1;j<=i;j++){
//             sum+=a;
//             a=b;
//             b=sum;
//             printf("%d ",sum);
//         }
//         printf("\n");
//     }
// }













/*
* * * * * 
  * * * *
    * * *
      * *
        *
*/

// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<i;j++){
//             printf("  ");
//         }
//         for(int j=1;j<=n-i+1;j++){
//             printf("* ");
//         }
//         printf("\n");
//     }
// }












/*
 1  2  3  4  5  
    4  6  8  10
       9  12 15
          16 20
             25
*/
// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<i;j++){
//             printf("   ");
//         }
//         for(int j=i;j<=n;j++){
//             printf("%-3d",i*j);
//         }
//         printf("\n");
//     }
// }













/*
5 4 3 2 1 
  4 3 2 1
    3 2 1
      2 1
        1
*/
// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<i;j++){
//             printf("  ");
//         }
//         for(int j=n-i+1;j>=1;j--){
//             printf("%d ",j);
//         }
//         printf("\n");
//     }
// }








/*
    1 2 3 4 5 
    2 2 3 4 5
    3 3 3 4 5
    4 4 4 4 5
    5 5 5 5 5
*/

// void main(){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i>=j){
//                 printf("%d ",i);
//             }
//             else{
//                 printf("%d ",j);
//             }
//         }
//         printf("\n");
//     }
// }




/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
*/

// void main(){
//   int n=5;
//   for(int i=1;i<=n;i++){
//       for(int j=1;j<=i;j++){
//         printf("%2d",j);
//       }
//       printf("\n");
//   }
//    for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i;j++){
//         printf("%2d",j);
//       }
//       printf("\n");
//   }
// }








/*
         1
       2 1
     3 2 1
   4 3 2 1
 5 4 3 2 1
   4 3 2 1
     3 2 1
       2 1
         1
*/

// void main(){
//   int n=5;
//   for(int i=1;i<=n;i++){
//       for(int j=n;j>=1;j--){
//         if(i>=j){
//         printf("%2d",j);
//         }
//         else{
//           printf("  ");
//         }
//       }
//       printf("\n");
//   }
//    for(int i=1;i<=n;i++){
//      for(int j=n;j>=1;j--){
//         if(i+j<n+1){
//         printf("%2d",j);
//         }
//         else{
//           printf("  ");
//         }
//       }
//       printf("\n");
//   }
// }
















/*
              1
           3  2  1
        5  4  3  2  1
     7  6  5  4  3  2  1
  9  8  7  6  5  4  3  2  1
*/

// void main(){
//   int n=5,num=1,temp=num;
//   for(int i=1;i<=n;i++){
//     for(int j=1;j<=n+i-1;j++){
//         if(i+j>=n+1){
//           printf("%3d",num);
//           num--;
//         }
//         else{
//           printf("   ");
//         }
//     }
//     num= temp+=2;  
//     printf("\n");
//   }
// }












/*
              1
           2  1  2
        3  2  1  2  3
     4  3  2  1  2  3  4
  5  4  3  2  1  2  3  4  5
*/

// void main(){
//   int n=5;
//   for(int i=1;i<=n;i++){
//     int num =i;
//     for(int j=1;j<=n+i-1;j++){
//         if(i+j>=n+1&& j<=5){
//           printf("%3d",num--);          
//         }
//         else if(i+j>=n+1){
//           num=j-4;
//           printf("%3d",num);          
//         }
//         else{
//           printf("   ");
//         }
//     }  
//     printf("\n");
//   }
// }






/*
* * * * * * * * * 
  * * * * * * *
    * * * * *
      * * *
        *
*/



// void main(){
//   int n=5;
//   for(int i=1;i<=n;i++){
//     for(int j=1;j<=2*n-1;j++){
//       if(j<i){
//         printf("  ");
//       }
//       else if(j<=2*n-i){
//         printf("* ");
//       }
//     }
//     printf("\n");
//   }
// }

// void main(){
//   int n=5;
//   for(int i=1;i<=n;i++){
//     for(int j=1;j<=2*n-i;j++){
//       if(j>=i){
//         printf("* ");
//       }
//       else{
//         printf("  ");
//       }
//     }
//     printf("\n");
//   }
// }

// int main() {
//     int n = 5; 
//     for (int i = 1; i <= n; i++) {
//         for (int s = 1; s < i; s++) {
//             printf("  ");  
//         }
//         for (int j = 1; j <= 2*(n - i) + 1; j++) {
//             printf("* ");
//         }
//         printf("\n");
//     }
//     return 0;
// }












/*
    *     * * * * 
    *     *
    *     *
    * * * * * * *
          *     *
          *     *
    * * * *     *
*/

// void main(){
//   int n=7;
//   int mid =(n+1)/2;
//   for(int i=1;i<=n;i++){
//     for(int j=1;j<=n;j++){
//         if(j==mid||i==mid||i==n&&j<=mid||j==1&&i<=mid||i==1&&j>mid||j==n&&i>mid){
//           printf("* ");
//         }
//         else{
//           printf("  ");
//         }
//     }
//     printf("\n");
//   }  
// }













/*
    * * * * * * * 
    *     *     *
    *     *     *
    * * * * * * *
    *     *     *
    *     *     *
    * * * * * * *
*/

// void main(){
//   int n=7;
//   int mid =(n+1)/2;
//   for(int i=1;i<=n;i++){
//     for(int j=1;j<=n;j++){
//         if(j==mid||i==mid||i==1||i==n||j==1||j==n){
//           printf("* ");
//         }
//         else{
//           printf("  ");
//         }
//     }
//     printf("\n");
//   }  
// }

















/*
        * 
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/

// void main(){
//   int n=5;
//   for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//       printf("  ");
//     }
//     for(int j=1;j<=2*i-1;j++){
//        printf("* ");
//     }
//     printf("\n");
//   }
//   for(int i=n-1;i>=1;i--){
//     for(int j=1;j<=n-i;j++){
//         printf("  ");
//     }
//     for(int j=1;j<=2*i-1;j++){
//        printf("* ");
//     }
//     printf("\n");
//   }
// }





/*
*************
****** ******
*****   *****
****     ****
***       ***
**         **
*           *
**         **
***       ***
****     ****
*****   *****
****** ******
*************
*/



int main() {
    int n = 7; // controls size (odd number looks best)

    // Upper half
    for (int i = 1; i <= n; i++) {
        for (int j = i; j < n; j++) {
            printf("*");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j == 1 || j == (2 * i - 1))
                printf("*");
            else
                printf(" ");
        }
        for (int j = i; j < n; j++) {
            printf("*");
        }
        printf("\n");
    }

    // Lower half
    for (int i = n - 1; i >= 1; i--) {
        for (int j = n; j > i; j--) {
            printf("*");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j == 1 || j == (2 * i - 1))
                printf("*");
            else
                printf(" ");
        }
        for (int j = n; j > i; j--) {
            printf("*");
        }
        printf("\n");
        
    }

    return 0;
}



