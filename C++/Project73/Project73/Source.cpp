#include<iostream>
using namespace std;
void main()
{
	int s;
	cout << "Please enter the size of the array: " << endl;
	cin >> s;
	int*b = new int[s];
	cout << "Please enter the elements of the array: " << endl;
	for (int i = 0; i < s; i++)
		cin >> b[i];
	cout << "Please enter the value to be added: " << endl;
	int x,f;
	cin >> x;
	cout << "Please enter the index: " << endl;
	cin >> f;
	int *a = new int[s + 1];
		for (int i = 0; i < f; i++)
			a[i] = b[i];
		for (int i = f; i < s+1; i++)
		{
			if (i == f)
				a[i] = x;
			else
				a[i] = b[i-1];
		}
		cout << "The new array is: " << endl;
		for (int i = 0; i < s + 1; i++)
			cout << a[i] << " ";
		cout << endl;
		int z;
		cout << "Please enter a value to delete: " << endl;
		cin >> z;
		int*g = new int[s];
		int n;
		for (int i = 0; i < s+1; i++)
			if (a[i] == z)
				n = i;
		for (int i = 0; i < n; i++)
			g[i] = a[i];
		for (int i = n + 1; i < s+1; i++)
			g[i-1] = a[i];
		cout << "The new array is: " << endl;
		for (int i = 0; i < s; i++)
			cout << g[i] << " ";
		cout << endl;
		cout << "Please entger the new elemnt to be deleted: " << endl;
		int d,k=0;
		cin >> d;
		for (int i = 0; i < s; i++)
		{
			if (g[i] == d)
				++k;
		}
		int*o = new int[s-k];
		int j = 0;
		for (int i = 0; i < s; ++i)
		{
			if (g[i] != d)
			{
				o[j] = g[i];
				++j;
			}
		}
		for (int i = 0; i < s - k; ++i)
			cout << o[j] << " ";
		delete[]b;
		delete[]a;
		delete[]g;
		delete[]o;
	system("pause");
}