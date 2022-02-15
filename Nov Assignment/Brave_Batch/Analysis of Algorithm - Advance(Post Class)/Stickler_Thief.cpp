#include <bits/stdc++.h>
using namespace std;
#define Abhishek main
typedef long long int ll;
int FindMaxSum(int arr[], int n)
    {
        if(n==1) return arr[0];
        if(n==2) return max(arr[0],arr[1]);
        int dp[n+1];
        dp[0]=0;
        dp[1]=arr[0];
        for(int i=2;i<=n;i++){
            dp[i]=max(dp[i-1],dp[i-2]+arr[i-1]);
        }
        return dp[n];
    }
int32_t  Abhishek()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;++i)
			cin>>a[i];
		cout<<FindMaxSum(a,n)<<endl;
	}
	return 0;
}