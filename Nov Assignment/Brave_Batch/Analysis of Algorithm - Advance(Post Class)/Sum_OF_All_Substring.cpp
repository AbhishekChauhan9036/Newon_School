#include<bits/stdc++.h>
using namespace std;
long long sumSubstrings(string s){

        int n = s.length(); 
        int m = 1000000007;
        long long dp[n+1];
        dp[0] = 0;
        dp[1] = (s[0]-'0');
        long long res = dp[1];
        
        for(int i=2;i<=n;i++)
        {
            dp[i] = ((dp[i-1]*10)%m + ((s[i-1]-'0')*i)%m)%m;
            res = (res + dp[i])%m;
            
        }
        return res;
    }
int main()
{

    int t;
    t=1;
    while(t--)
    {

        string s;
        cin>>s;
       
        cout <<sumSubstrings(s) << endl;
        
    }
    return 0;
}