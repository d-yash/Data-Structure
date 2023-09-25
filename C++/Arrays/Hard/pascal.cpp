#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// 1. Print element at given place
// void nCr(int n, int r){
//     long long ans = 1;
//     for(int i=0; i<r; i++){
//         ans = ans * (n-i);
//         ans = ans / (i+1);
//     }
//     cout<<"Element : "<<ans<<endl;
// }
// void printElement(int row, int col){
//     nCr(row-1, col-1);
// }

// 2. Print the Nth row 
// void generateRow(int n){
//     long long ans = 1;
//     cout<<ans<<" ";
//     for(int i=1; i<n; i++){
//         ans = ans * (n-i);
//         ans = ans / i;
//         cout << ans << " ";
//     }
//     cout<<endl;
// }   

vector<int> generateRow(int n){
    vector<int> row;
    long long ans = 1;
    row.push_back(ans);

    for(int i=1; i<n; i++){
        ans = ans * (n-i);
        ans = ans / i;
        row.push_back(ans);
    }
    return row;
}
vector<vector<int>> printPascalTriangle(int n){
    vector<vector<int>> ans;
    for(int i=1; i<=n; i++){
        ans.push_back(generateRow(i));
    }
    return ans;
}
int main()
{
    int n = 5;
    vector<vector<int>> ans = printPascalTriangle(n);
    for (auto it : ans) {
        for (auto ele : it) {
            cout << ele << " ";
        }
        cout<<"\n";
    }
    return 0;
}