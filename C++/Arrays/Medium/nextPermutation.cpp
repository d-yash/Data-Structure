#include <bits/stdc++.h>
#include <vector>
using namespace std;


class Solution {
public:
    void swap(vector<int>& nums, int i, int to){
        int temp = nums[i];
        nums[i] = nums[to];
        nums[to] = temp;
    }
    void reverse(vector<int> &nums, int from, int to){
        for(int i=from; i<=to; i++){
            swap(nums, i, to);
            to--;
        }
    } 
    void nextPermutation(vector<int>& nums) {
        // next_permutation(nums.begin(), nums.end());
        
        int n = nums.size();
        int ind = -1;

        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind != -1){
            for(int i=n-1; i>ind; i--){
                if(nums[i] > nums[ind]){
                    cout<<"Swap("<<nums[ind]<<" , "<<nums[i]<<")"<<endl;
                    swap(nums, i, ind);
                    break;
                }
            }
        }
        
        reverse(nums, ind+1, n-1);
    }
};

int main(){
    Solution sol;
    vector<int> nums = {2, 1, 5, 4, 3, 0, 0};
    sol.nextPermutation(nums);

    for(int i:nums){
        cout<<i<<" ";
    }
}
