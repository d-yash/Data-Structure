#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// 1. Brute - using 2 for loops
// vector<int> findMissingRepeatingNumbers(vector<int> a){
//     int n = a.size();
//     int repeating = -1, missing = -1;
//     int  count = 0; 
//
//     for(int i=1; i<=n; i++){
//         count = 0;
//         for(int j=0; j<n; j++){
//             if(i == a[j])
//                 count++;
//         }
//         if(count == 0){
//             missing = i;
//         }
//         else if(count == 2) 
//             repeating = i;
//
//         if(repeating != -1 && missing != -1)
//             break;
//     }
//     return {repeating, missing};
// }   

// 2. Better - Using hashing
// vector<int> findMissingRepeatingNumbers(vector<int> a){
//     int n = a.size();
// //
//     int hash[n+1] = {0};
// //
//     for(int i=0; i<n; i++){
//         hash[a[i]]++;
//     }
// //
//     int repeating = -1, missing = -1;
//     for(int i=1; i<=n; i++){
//         if(hash[i] == 2)    
//             repeating = i;
//         else if(hash[i] == 0)
//             missing = i;
// //       
//         if(repeating != -1 && missing != -1)
//             break;
//     }
//     return {repeating, missing};
// }

vector<int> findMissingRepeatingNumbers(vector<int> a){
    // assume x = repeating number  & y = missing number
    int n = a.size();
    long long s = 0, s2 = 0;
    long long sn = (n*(n+1))/2;
    long long s2n = (n*(n+1)*(2*n+1))/6;

    for(int i=0; i<n; i++){
        s += a[i];
        s2 += (long long)a[i] * (long long)a[i];
    }

    long long val1 = s - sn;        // x - y
    long long val2 = s2 - s2n;      // x2 - y2
    val2 = val2 / val1;             // (x+y)(x-y) / (x-y) = (x+y)

    long long x = (val1 + val2)/2;
    long long y = x - val1;

    return {(int)x, (int)y};
}

int main()
{
    vector<int> a = {3, 1, 2, 5, 4, 6, 7, 5};
    vector<int> ans = findMissingRepeatingNumbers(a);
    cout << "The repeating and missing numbers are: {"
         << ans[0] << ", " << ans[1] << "}\n";
    return 0;
}