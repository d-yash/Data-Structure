#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// 1. Better solution - Using hashmap 
// vector<int> majorityElement(vector<int> arr){
//     map<int, int> mpp;
//     int floor = arr.size()/3 + 1;
//     vector<int> ans;

//     for(int i=0; i<arr.size(); i++){
//             mpp[arr[i]] += 1;
//         if(mpp[arr[i]] == floor){
//             ans.push_back(arr[i]);
//         }
//         if(ans.size() == 2)
//             break;
//     }
//     return ans;
// }

vector<int> majorityElement(vector<int> arr){
    int count1 = 0, count2 = 0;
    int ele1 = -1, ele2 = -1;

    for(int i=0; i<arr.size(); i++){
        if(count1 == 0 && arr[i]!=ele2){
            count1 = 1;
            ele1 = arr[i];
        }
        else if(count2 == 0 && arr[i]!=ele1){
            count2 = 1;
            ele2 = arr[i];
        }
        else if(arr[i] == ele1) count1++;
        else if(arr[i] == ele2) count2++;
        else{
            count1--;
            count2--;
        }
    }
    int floor = int(arr.size()/3) + 1;
    count1 = 0, count2 = 0;

    for(int i=0; i<arr.size(); i++){
        if(arr[i] == ele1)  count1++;
        if(arr[i] == ele2)  count2++;
    }

    vector<int> ans;

    if(count1 >= floor) ans.push_back(ele1);
    if(count2 >= floor) ans.push_back(ele2);

    return ans;
}

int main()
{
    vector<int> arr = {4,2,1,1};
    vector<int> ans = majorityElement(arr);
    cout << "The majority elements are: ";
    for (auto it : ans)
        cout << it << " ";
    cout << "\n";
    return 0;
}