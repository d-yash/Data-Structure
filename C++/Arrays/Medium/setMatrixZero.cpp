#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;
// Brute force - using 2 extra arrays
// vector<vector<int>> zeroMatrix(vector<vector<int>> matrix, int n, int m)
// {
//     int row[n] = {0};
//     int col[m] = {0};

//     for (int i = 0; i < n; i++)
//     {
//         for (int j = 0; j < m; j++)
//         {
//             if (matrix[i][j] == 0){
//                 row[i] = 1;
//                 col[j] = 1;
//             }
//         }
//     }
//     for (int i = 0; i < n; i++)
//     {
//         for (int j = 0; j < m; j++)
//         {
//             if(row[i]==1 || col[j]==1){
//                 matrix[i][j] = 0;
//             }
//         }
//     }
//     return matrix;
// }
vector<vector<int>> zeroMatrix(vector<vector<int>> matrix, int n, int m)
{
    int col0 = 1;

    //Step-1  mark row, col and variable
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(matrix[i][j] == 0){
                matrix[i][0] = 0;
                if(j != 0){
                    matrix[0][j] = 0;
                }
                else{
                    col0 = 0;
                }
            }
        }
    }

    //mark matrix fron (1,1) to (n-1, m-1)
    for(int i=1; i<n; i++){
        for(int j=1; j<m; j++){
            if(matrix[i][j] != 0){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    //Step-3 
    //First Row
    if(matrix[0][0] == 0){
        for(int j=1; j<m; j++){
            matrix[0][j] = 0;
        }
    }

    //First col
    if(col0 == 0){
        for(int i=0; i<n; i++){
            matrix[i][0] = 0;
        }
    }

    return matrix;
}
int main()
{
    vector<vector<int>> matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
    int n = matrix.size();
    int m = matrix[0].size();
    vector<vector<int>> ans = zeroMatrix(matrix, n, m);

    for (auto it : ans)
    {
        for (auto ele : it)
        {
            cout << ele << " ";
        }
        cout << endl;
    }
    return 0;
}