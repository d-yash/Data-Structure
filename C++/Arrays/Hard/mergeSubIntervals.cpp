#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

vector<vector<int>> mergeOverlappingIntervals(vector<vector<int>> arr)
{
    vector<vector<int>> ans;
    sort(arr.begin(), arr.end());
    int n = arr.size();

    for (int i = 0; i < n; i++)
    {
        int start = arr[i][0];
        int end = arr[i][1];

        if (!ans.empty() && end <= ans.back()[1])
            continue;

        for (int j = i + 1; j < n; j++)
        {
            if (arr[j][0] <= end)
            {
                end = max(arr[j][1], end);
            }
            else
            {
                break;
            }
        }
        ans.push_back({start, end});
    }
    return ans;
}

// 2. Optimal
// vector<vector<int>> mergeOverlappingIntervals(vector<vector<int>> arr){
//     vector<vector<int>> ans;
//     sort(arr.begin(), arr.end());

//     for(int i=0; i<arr.size(); i++){
//         if(ans.empty() || ans.back()[1] < arr[i][0]){
//             ans.push_back(arr[i]);
//         }else{
//             ans.back()[1] = max(ans.back()[1], arr[i][1]);
//         }
//     }
//     return ans;
// }
int main()
{
    vector<vector<int>> arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
    vector<vector<int>> ans = mergeOverlappingIntervals(arr);
    cout << "The merged intervals are: "
         << "\n";
    for (auto it : ans)
    {
        cout << "[" << it[0] << ", " << it[1] << "] ";
    }
    cout << endl;
    return 0;
}