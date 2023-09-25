#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// int findMaximum(vector<int> arr)
// {
//     int ans = INT_MIN;
//     for (int i = 0; i < arr.size(); i++)
//     {
//         ans = max(ans, arr[i]);
//     }
//     return ans;
// }

bool checkDivisor(vector<int> arr, int limit, int mid)
{
    long long sum = 0;
    for (int i = 0; i < arr.size(); i++)
    {
        sum += ceil((double)arr[i] / (double)mid);
    }
    if (sum <= limit)
        return true;
    else
        return false;
}

int smallestDivisor(vector<int> arr, int limit)
{
    int low = 1, high = *max_element(arr.begin(), arr.end());

    while (low <= high)
    {
        int mid = (low + high) / 2;
        if (checkDivisor(arr, limit, mid))
            high = low + 1;
        else
            low = mid + 1;
    }
    return low;
}

int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};
    int limit = 8;
    int ans = smallestDivisor(arr, limit);
    cout << "The minimum divisor is: " << ans << "\n";
    return 0;
}