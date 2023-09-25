#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int findUpper(vector<int> arr, int target){
    int start = 0, end = arr.size()-1;
        int ans = -1;
    while(start <= end){
        int mid = start + (end-start)/2;
        if(arr[mid] > target){
            end = mid - 1;
        }else if(arr[mid] < target){
            start = mid + 1; 
        }else{
            ans = mid;
            start = mid + 1;
        }
    }
    return ans;
}
int findLower(vector<int> arr, int target){
    int start = 0, end = arr.size()-1;
        int ans = -1;
    while(start <= end){
        int mid = start + (end-start)/2;
        if(arr[mid] > target){
            end = mid - 1;
        }else if(arr[mid] < target){
            start = mid + 1; 
        }else{
            ans = mid;
            end = mid - 1;
        }
    }
    return ans;
}
int count(vector<int> arr, int target){
    return (findUpper(arr, target) - findLower(arr, target) + 1);
}
int main()
{
    vector<int> arr =  {2, 4, 6, 8, 8, 8, 8, 8, 11, 13};
    int target = 8;
    int ans = count(arr, target);
    cout << "The number of occurrences is: "<< ans << "\n";
    return 0;
}