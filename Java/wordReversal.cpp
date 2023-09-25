#include <iostream>
#include <vector>
#include <cmath>
#include <map>
using namespace std;

string reversal(string str){
    int i = str.size() - 1;
    string ans = "";
    
    while(i >= 0){
        while(i>=0 && str.at(i) == ' ')
            i--;

        if(i < 0)
            break;
            
        int j = i;
        while(j>=0 && str.at(j) != ' ')
            j--;
        
        // ans = ans + str.substr(j+1, i-j) + " ";
        string temp = "";
        for(int k=j; k<=i; k++){
            temp = temp + str[k];
        }
        ans = ans + temp;
        i = j;
    }
    return ans;
}

int main() {
    string str = "  hello sky is  blue!  ";
    cout << reversal(str) << endl;

    return 0;
}
