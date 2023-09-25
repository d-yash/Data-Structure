#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

bool checkBloomed(vector<int> arr, int days, int m, int k){
    int count = 0, noOfB = 0;
    for(int i=0; i<arr.size(); i++){
        if(arr[i] <= days)
            count++;
        else{
            noOfB += (count/k);
            count = 0; 
        }
    }
    noOfB += (count/k);

    if(noOfB >= m)
        return true;
    else
        return false;
    
}
int roseGarden(vector<int> arr, int m, int k){
    int n = arr.size();
    long long val = (long long)m * (long long)k;
    if(val > n) 
        return -1;

    int low = INT_MAX, high = INT_MIN;    
    for(int i=0; i<arr.size(); i++){
        high = max(high, arr[i]);
        low = min(low, arr[i]);
    }

    while(low <= high){
        int mid = (low + high)/2;

        if(checkBloomed(arr, mid, m, k))
            high = mid - 1;
        else    
            low = mid + 1;
    }
    return low;
}
int main()
{
    vector<int> arr = {7, 7, 7, 7, 13, 11, 12, 7};
    int k = 3;
    int m = 2;
    int ans = roseGarden(arr, k, m);
    if (ans == -1)
        cout << "We cannot make m bouquets.\n";
    else
        cout << "We can make bouquets on day " << ans << "\n";
    return 0;
}