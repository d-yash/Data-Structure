#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int search(vector<int> arr, int target)
{
    int low = 0, high = arr.size() - 1;

    while (low <= high)
    {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target)
        {
            return mid;
        }
        // For Array having duplicate values
        // if (arr[low] == arr[mid] == arr[high])
        // {
        //     low += 1;
        //     high -= 1;
        //     continue;
        // }
        if (arr[low] <= arr[mid])
        {
            if (arr[low] <= target && target <= arr[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        else
        {
            if (arr[mid] <= target && target <= arr[high])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
    }
    return -1;
}
int main()
{
    vector<int> arr = {3,1};
    int k = 1;
    cout << search(arr, k) << endl;
    return 0;
}