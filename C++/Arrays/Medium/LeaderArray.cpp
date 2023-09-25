#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

vector<int> printLeaders(int arr[], int n){
    vector<int> ans;
    int max = arr[n-1];
    ans.push_back(arr[n-1]);

    for (int i = n-2; i >= 0; i--)
    {
        if(arr[i] > max){
            ans.push_back(arr[i]);
            max = arr[i];
        }
    }
    return ans;
    
}
int main()
{
    int arr[] = {10, 22, 12, 3, 0, 6};
    
    vector<int> ans = printLeaders(arr, sizeof(arr)/sizeof(arr[0]));
    

    for(int i=ans.size()-1; i>=0; i--){
        cout<<ans[i]<<" ";
    }
    return 0;
}