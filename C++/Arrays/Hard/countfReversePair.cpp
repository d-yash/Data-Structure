#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;
    
int main()
{
    vector<int> a = {4, 1, 2, 3, 1};
    int n = 5;
    int cnt = team(a, n);
    cout << "The number of reverse pair is: "<< cnt << endl;
    return 0;
}