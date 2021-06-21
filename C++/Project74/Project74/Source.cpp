#include<iostream>
using namespace std;
void main()
{
	int x;
	cout << "Please enter the size of the aray: " << endl;
	cin >> x;
	cout << "Please enter the elements of the array: " << endl;
	int *b = new int[x];
	for (int i = 0; i < x; i++)
		cin >> b[i];
	cout << "Plaese enter an element to add: " << endl;
	int z,v;
	cin >> z;
	cout << "Please enter the index: " << endl;
	cin >> v;
	int *a = new int[x + 1];
	for (int i = 0; i < v; i++)
		a[i] = b[i];
	for (int i = v; i < x + 1; i++) 
	{
		if (i == v  )
			a[i] = z;
		else
			a[i] = b[i - 1];
	}
	cout << "The new array is: " << endl;
	for (int i = 0; i < x + 1; i++)
		cout << a[i] << " ";
	cout << endl;
	cout << "Please enter a element to delete: " << endl;
	int d,m;
	cin >> d;
	for (int i = 0; i < x + 1; i++)
		if (a[i] == d)
			m = i;
	int *h = new int[x];
	for (int i = 0; i < m; i++)
		h[i] = a[i];
	for (int i = m; i < x; i++)
			h[i] = a[i + 1];
	cout << "The ne array is: " << endl;
		for (int i = 0; i < x; i++)
			cout << h[i] << " ";
	cout << endl;
	cout << "Please enter a new element to delete: " << endl;
	int l,k=0;
	cin >> l;
	for (int i = 0; i < x; i++)
		if (h[i] == l)
			++k;
	int*g = new int[x - k];
	int j = 0;
	for (int i = 0; i < x; i++)
	{
		if (h[i] != l) 
		{
			g[j] = h[i];
			j++;
		}
	}
	cout << "The new array is: " << endl;
	for (int i = 0; i < (x - k); i++)
		cout << g[i] << " ";
	cout << endl;
	system("pause");
}