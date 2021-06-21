#include<iostream>
using namespace std;
int* search(int *p, int s, int n) 
{
	for (int i = 0; i < n; i++)
	{
		if (p[i] == s) 
		{
			cout << "The integer is found in the address: ";
			return &p[i];
		}
			
	}
	return NULL;
}
void main()
{
	int n,x;
	cout << "Enter how many integers you want to enter? ";
	cin >> n;
	int*arr = new int[n];
	cout << "Enter the integers: ";
	for (int i = 0; i < n; i++)
		cin >> arr[i];
	cout << "Enter the target: ";
	cin >> x;
	cout << search(arr, x, n)<< endl;
	delete[]arr;
	system("pause");
}