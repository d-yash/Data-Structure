#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

bool areBracketsBalanced(string expr){
    stack<char> st;

    for(int i=0; i<expr.length(); i++){
        if(st.empty()){
            st.push(expr[i]);
        }else if((expr[i]==')' && st.top()=='(') || (expr[i]=='}' && st.top()=='{') || (expr[i]==']' && st.top()=='[')){
            st.pop();
        }else{
            st.push(expr[i]);
        }
    }
    if(st.empty()){
        return true;
    }
    return false;
}
int main()
{
    string expr = "{()}[]";
    // Function call
    if (areBracketsBalanced(expr))
        cout << "Balanced";
    else
        cout << "Not Balanced";
    return 0;
}