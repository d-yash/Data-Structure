#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int setCheckPoint(int mid, int n, int m)
{
    long long ans = 1;
    for (int i = 1; i <= n; i++)
    {
        ans *= mid;
        if (ans > m)
        {
            return 2;
        }
    }
    if (ans == m)
        return 1;
    return 0;
}

int NthRoot(int n, int m)
{
    int low = 1, high = m;

    while (low <= high)
    {
        int mid = low + (high - low) / 2;
        int checkPoint = setCheckPoint(mid, n, m);
        if (checkPoint == 1)
            return mid;
        else if (checkPoint == 0)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}

int main()
{
    int n = 3, m = 27;
    int ans = NthRoot(n, m);
    cout << "The answer is: " << ans << "\n";
    return 0;
}