#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;

    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]>a[i+1])
        {
            int temp=a[i+1];
            a[i+1]=a[i];
            a[i]=temp;
        }
    }
    for(int i=0;i<n;i++)
    {
        cout<<a[i];
    }
    return 0;
}