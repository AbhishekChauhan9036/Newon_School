#include<bits/stdc++.h>
using namespace std;
int knapSack(int W, int wt[], int val[], int n) 
    { 

        if(n==0 || W==0)
            return 0;
        int t[n+1][W+1];
        
        for(int i =0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
            }
        }
       
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j)
                    t[i][j] = max(val[i-1]+t[i-1][j-wt[i-1]],
                                   t[i-1][j]);
                else if(wt[i-1]>j)
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][W];
    }

int32_t main()
 {

    int t;
    cin>>t;
    while(t--)
    {
        int n, w;
        cin>>n>>w;
        
        int val[n];
        int wt[n];
        
        
        for(int i=0;i<n;i++)
            cin>>val[i];
        
 
        for(int i=0;i<n;i++)
            cin>>wt[i];
      
        cout<<knapSack(w, wt, val, n)<<endl;
        
    }
	return 0;
}