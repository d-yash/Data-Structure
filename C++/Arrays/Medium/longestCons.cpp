#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int countLongestConsecutiveSeq(vector<int>& a){
    int n = a.size();
    if(n == 0){
        return 0;
    }

    sort(a.begin(), a.end());
    int last_smallest = INT_MIN;
    int count = 0;
    int ans = 1;

    for(int i=0; i<a.size(); i++){
        if(a[i]-1 == last_smallest){
            count++;
        }
        else if(a[i] != last_smallest){
            count=1;
        }
        last_smallest = a[i];
        ans = max(ans, count);
    }
    return ans;
}
int main()
{
    vector<int> a = {100,1, 200, 1, 2, 3, 4};
    int ans = countLongestConsecutiveSeq(a);
    cout << "The longest consecutive sequence is - " << ans << "\n";
    return 0;
    return 0;
}