#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// With using sort function
void mergeArr(long long arr1[], long long arr2[], int n, int m){
    int left = n - 1;
    int right = 0;

    while(left >= 0 && right < m){
        if(arr1[left] > arr2[right]){
            swap(arr1[left], arr2[right]);
            left--;
            right++;
        }else{
            break;
        }
    }

    sort(arr1, arr1 + n);
    sort(arr2, arr2 + m);
}

// without using sort function
// https://www.youtube.com/watch?v=r4YEYaMlJLw
// Leet code question is little bit different in that we need to merge 2 arrays
// first array contains m non zero element and rest of n element is zero and len(arr2) is also n 

int main()
{
    long long arr1[] = {1, 4, 8, 10};
    long long arr2[] = {2, 3, 9};
    int n = 4, m = 3;
    mergeArr(arr1, arr2, n, m);
    cout << "The merged arrays are: "
         << "\n";
    cout << "arr1[] = ";
    for (int i = 0; i < n; i++)
    {
        cout << arr1[i] << " ";
    }
    cout << "\narr2[] = ";
    for (int i = 0; i < m; i++)
    {
        cout << arr2[i] << " ";
    }
    cout << endl;
    return 0;
}