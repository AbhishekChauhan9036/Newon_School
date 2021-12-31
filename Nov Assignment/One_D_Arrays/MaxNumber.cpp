#include <bits/stdc++.h>
using namespace std;
void print3largest(int arr[], int arr_size)
{
	int first, second, third;
	third = first = second = INT_MIN;
	for(int i = 0; i < arr_size; i++)
	{
		if (arr[i] > first)
		{
			third = second;
			second = first;
			first = arr[i];
		}
		else if (arr[i] > second)
		{
			third = second;
			second = arr[i];
		}

		else if (arr[i] > third)
			third = arr[i];
	}

	cout<< first << " " << second << " "
		<< third << endl;
}
int main()
{
	int k;
	cin>>k;
     for(int i=0;i<k;i++){
		 	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	print3largest(arr, n);
	 }
	return 0;
}