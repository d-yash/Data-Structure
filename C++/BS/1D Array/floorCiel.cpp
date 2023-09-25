#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int findCiel(vector<int> arr, int target){
    int low = 0, high = arr.size();
    int ans;

    while(low <= high){
        int mid = low + (high - low)/2;

        if(arr[mid] >= target){
            ans = arr[mid];
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }
    return ans;
}
int findFloor(vector<int> arr, int target){
    int low = 0, high = arr.size();
    int ans;

    while(low <= high){
        int mid = low + (high-low)/2;

        if(arr[mid] <= target){
            ans = arr[mid];
            low = mid + 1;
        }else{
            high = mid - 1;
        }
    }
    return ans;
}
pair<int, int> getFloorAndCeil(vector<int> arr, int target){
    int floor = findFloor(arr, target);
    int ciel = findCiel(arr, target);
    return make_pair(floor, ciel);
}
int main()
{
    vector<int> arr = {3, 4, 4, 7, 8, 10};
    int target = 5;
    pair<int, int> ans = getFloorAndCeil(arr, target);
    cout << "The floor and ceil are: " << ans.first<< " " << ans.second << endl;
    return 0;
}