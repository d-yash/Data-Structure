#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int findMaximum(vector<int> arr){
    int ans =INT_MIN;
    for(int i=0; i<arr.size(); i++){
        ans = max(ans, arr[i]);
    }
    return ans;
}

int calculateHour(vector<int> arr, int hourly){
    int totalH = 0;
    for(int i=0; i<arr.size(); i++){
        totalH += ceil((double)arr[i] / (double)hourly);
    }
    return totalH;
}

int minimumRateToEatBananas(vector<int> arr, int h){
    int low = 1, high = findMaximum(arr);

    while(low <= high){
        int mid = low + (high-low)/2;
        int totalH = calculateHour(arr, mid);

        if(totalH <= h){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }
    return low;
}
int main()
{
    vector<int> v = {7, 15, 6, 3};
    int h = 8;
    int ans = minimumRateToEatBananas(v, h);
    cout << "Koko should eat atleast " << ans << " bananas/hr.\n";
    return 0;
}