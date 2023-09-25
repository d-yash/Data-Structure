#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int findLastOccurance(vector<int> arr, int target){
    int low = 0, high = arr.size()-1;
    int ans = -1;

    while(low <= high){
        int mid = low + (high-low)/2;

        if(arr[mid] > target){
          high = mid - 1;
        }else if(arr[mid] < target){
            low = mid + 1;
        }else{
          ans = mid;
          low = mid + 1;
        }
    }
    return ans;
}

int main() {
  int target = 13;
  vector < int > arr = {3,4,13,13,13,20,40};  
  cout << findLastOccurance(arr, target) << "\n";

  return 0;
}