#include<iostream>
using namespace std;
void main()
{
	int n,x;
	cout << "Please entetr a val1: " << endl; cin >> n;
	int*a = new int[n];
	cout << "Enter numbers: " << endl;
	for (int i = 0; i < n; i++)
		cin >> a[i];
	cout << "Enter a number to aloc last: " << endl;
	cin >> x;
	for (int i = n - 1; i >= 0; --i)
	{
		if (a[i] == x) {
			cout << "The adress of x is: " << &a[i] << endl;
			break;
		}
	}
	system("pause");
}