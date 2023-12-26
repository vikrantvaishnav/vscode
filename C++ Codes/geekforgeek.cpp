// // { Driver Code Starts
// // Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


//  // } Driver Code Ends
// // User function Template for C++

class Solution {
  public:
    int calcDist(string& word1, string& word2)
    {
        int n = word1.size();
        int ans = 0;
        for(int i =0; i<n;i++)
        {
            ans+=abs(word1[i] - word2[i]);
        }
        return ans;
    }
    int minimum_difference(int n, vector<string> &words) {
        int ans = INT_MAX;
        for(int i = 0; i < n; i++)
        {
            string word1 = words[i];
            for(int j = i+1;j<n;j++)
            {
                string word2 = words[j];
                ans = min(ans, calcDist(word1, word2));
            }
        }
        return ans;
    }
}


// // // { Driver Code Starts.

// int main() {

//     int t;
//     cin >> t;
//     while (t--) {

//         int n;
//         cin >> n;
//         vector<string> words(n);
//         for (int i = 0; i < n; i++) {
//             cin >> words[i];
//         }
//         Solution obj;
//         cout << obj.minimum_difference(n, words) << endl;
//     }
// }
  // } Driver Code Ends








// // { Driver Code Starts
// //Initial Template for C++
// #include<bits/stdc++.h>
// using namespace std;


//  // } Driver Code Ends
// //User function Template for C++

// class Solution{
//     public:
//     vector<int> getNGE(vector<int>& heights, int n)
//     {
//         stack<int> st;
//         vector<int> result(n);
//         for(int i =n-1;i>=0;i--)
//         {
//             if(st.empty())
//             {
//                 result[i]=-1;
//                 st.push(i);
//             }
//             else if(heights[st.top()] > heights[i])
//             {
//                 result[i]=st.top();
//                 st.push(i);
//             }
//             else{
//                 while(!st.empty()&& heights[st.top()] <= heights[i])
//                 {
//                     st.pop();
//                 }
//                 if(st.empty()){
//                     result[i]= -1;
//                 }
//                 else {
//                     result[i] = st.top();
//                 }
//                 st.push(i);
//             }
        
//         }
//         return result;
//     }
//     long long maximum_energy(int n, vector<int> &heights){
//     vector<int> positionsOfNGE = getNGE(heights, n);
//     int ans = INT_MIN;
//     for(int i=n-1;i>=0;i--)
//     {
//         if(positionsOfNGE[i]== -1)
//         {
//             ans = max(ans ,heights[i]);
//         }
//         else
//         {
//             ans = max(ans, heights[i] ^ heights[positionsOfNGE[i]]);
//             heights[i] = heights[i] ^ heights[positionsOfNGE[i]];
//         }
//     }
//     return ans;
    
//     }
// };


// // { Driver Code Starts.

// int main(){

//     int t;
//     cin >> t;
//     while (t--) {

//         int n;
//         cin >> n;
//         vector<int> heights(n);
//         for (int i = 0; i < n; i++ ){
//             cin >> heights[i];
//         }
//         Solution obj;
//         cout << obj.maximum_energy(n, heights) << endl;
//     }
// }  // } Driver Code Ends