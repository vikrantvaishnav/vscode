#include<iostream>
using namespace std;
int main()
{
    int count=0;
    char str[100];
    cin>>str;
    int n;
    cin>>n;
    for (int i=0;i<=n-1;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if (str[0]==str[1])
            {
                count++;
            }
            int final =count;
            if (count>final)

            {
                final = count;
            
            }
            else
            {continue;}
        }
        count=0;
    }
    return 0;
}