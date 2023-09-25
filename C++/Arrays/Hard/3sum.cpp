#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// 
// vector<vector<int>> triplet(int n, vector<int> arr){
//     set<vector<int>> subAns;

//     for(int i=0; i<n; i++){
//         set<int> hashSet;
//         for(int j=i+1; j<n; j++){
//             int k = -(arr[i] + arr[j]);

//             if(hashSet.find(k) != hashSet.end()){
//                 //forming triplet and sorting them
//                 vector<int> temp = {arr[i], arr[j], k};
//                 sort(temp.begin(), temp.end());

//                 //storing it to set to avoid duplicates 
//                 subAns.insert(temp);
//             }
//             //storing element in hashset
//             hashSet.insert(arr[j]);
//         }
//     }

//     //converting to return datatype
//     vector<vector<int>> ans(subAns.begin(), subAns.end());
//     return ans;
// }
vector<vector<int>> triplet(int n, vector<int> arr){
    vector<vector<int>> ans;

    sort(arr.begin(), arr.end());
    for(int i=0; i<n; i++){
        if(i > 0 && arr[i] == arr[i-1]) continue;

        int j = i + 1;
        int k = n - 1;
        while(j < k){
            int sum = arr[i] + arr[j] + arr[k];
            if(sum > 0){
                k--;
            }else if(sum < 0){
                j++;
            }else{  
                vector<int> temp = {arr[i], arr[j], arr[k]};
                ans.push_back(temp);
                j++;
                k--;
                while(arr[j] == arr[j-1])   j++;
                while(arr[k] == arr[k+1])   k--;
            }
        } 
    }
    return ans;
}
int main()
{
    vector<int> arr = { -1, 0, 1, 2, -1, -4};
    int n = arr.size();
    vector<vector<int>> ans = triplet(n, arr);
    for (auto it : ans) {
        cout << "[";
        for (auto i : it) {
            cout << i << " ";
        }
        cout << "] ";
    }
    cout << "\n";
    return 0;
}