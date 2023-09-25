#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// 1. Brute force - using 2 loops  
// int getInversionOfArray(vector<int> arr){
//     int count = 0;
//     int n = arr.size();
//
//     for(int i=0; i<n; i++){
//         for(int j=i+1; j<n; j++){
//             if(arr[i] > arr[j])
//                 count++;
//         }
//     }
//     return count;
// }
int merge(vector<int> &arr,int low,int mid,int high){
    vector<int> temp;
    int left = low;
    int right = mid + 1;
    int count = 0;
    while(left <= mid && right <= high){
        if(arr[left] <= arr[right]){
            temp.push_back(arr[left]);
            left++;
        }
        else{
            temp.push_back(arr[right]);
            count += (mid - left + 1);
            right++;
        }
    }
    while(left <= mid){
        temp.push_back(arr[left]);
        left++;
    }
    while(right <= high){
        temp.push_back(arr[right]);
        right++;
    }
    for(int i=low; i<=high; i++){
        arr[i] = temp[i - low];
    }
    return count;
}
int mergeSort(vector<int> &arr,int low,int high){
    int count = 0;
    if (low < high) {
        int mid = low + (high - low)/2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
    }
    return count;
}
int getInversionOfArray(vector<int> &arr){
    return mergeSort(arr, 0, arr.size()-1);
}
int main()
{
    vector<int> arr = {5,3,2,1,4};
    cout<<"Total Inversion : "<<getInversionOfArray(arr)<<endl;
    return 0;
}