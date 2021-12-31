#include <bits/stdc++.h> 
using namespace std;
int main() {
    int a,b,c,d=0;
    cin>>a>>b>>c;
    if(a>b){
        d=(a-b);
    }else{
        d=(b-a);
    }

    cout<<d/c;
	return 0;
}