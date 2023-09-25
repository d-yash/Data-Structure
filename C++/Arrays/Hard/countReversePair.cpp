#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// 1. Brute force - Using 2 loops
// int getCountOfReversePair(vector<int> arr)
// {
//     int count = 0;
//     int n = arr.size();
//     for (int i = 0; i < n; i++)
//     {
//         for (int j = i + 1; j < n; j++)
//         {
//             if(arr[i] > 2*arr[j])
//                 count++;
//         }
//     }
//     return count;
// }

void merge(vector<int> &arr, int low, int mid, int high){
    vector<int> temp;
    int left = low, right = mid + 1;
    while(left <= mid && right <= high){
        if(arr[left] <= arr[right]){
            temp.push_back(left);
            left++;
        }
        else{
            temp.push_back(arr[right]);
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
}
int countPairs(vector<int> &arr, int low, int mid, int high){
    int right = mid + 1;
    int count = 0;
    for(int i=low; i<=mid; i++){
        while(right <= high && arr[i] > 2*arr[right])
            right++;
        count += (right - (mid + 1));
    }
    return count;
} 
int mergeSort(vector<int> &arr, int low, int high){
    int count = 0;
    if(low < high){
        int mid = low + (high - low)/2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);
    }
    return count;
}
int getCountOfReversePair(vector<int> &arr){
    return mergeSort(arr, 0, arr.size()-1);
}
int main()
{
    vector<int> arr = {4, 1, 2, 3, 1};
    int cnt = getCountOfReversePair(arr);
    cout << "The number of reverse pair is: "
         << cnt << endl;
    return 0;
}