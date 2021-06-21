#include<iostream>
using namespace std;
void main()
{
	int s;
	cout << "Please enter the size of the array: " << endl;
	cin >> s;
	int*b = new int[s];
	cout << "Please enter vlues for the array: " << endl;
	for (int i = 0; i < s; i++)
		cin >> b[i];
	cout << "Please enter a new element to be added: " << endl;
	int x,f;
	cin >> x;
	cout << "Please enter the index: " << endl;
	cin >> f;
	int*a = new int[s + 1];
	for (int i = 0; i < f; i++)
		a[i] = b[i];
	for (int i = f; i < s; i++)
	{
		if (i == f)
			a[i] = x;
		else
			a[i+1] = b[i];
	}
	cout << "The new array is: " << endl;
	for (int i = 0; i < s + 1; i++)
		cout << a[i] << " ";
	cout << endl;
	cout << "Please enter the index to be deleted: " << endl;
	int c;
	cin >> c;
	int *g = new int[s];
	for (int i = 0; i < c; i++)
		g[i] = a[i];
	for (int i = c; i < s; i++)
	{
		if (i == c)
			g[i] = a[i+1];
		else
			g[i] = a[i + 1];
	}
	for (int i = 0; i < s; i++)
		cout << g[i] << " ";
	cout << endl;
	delete[]a;
	delete[]b;
	delete[]g;
	system("pause");
}