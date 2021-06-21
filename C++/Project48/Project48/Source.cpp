#include<iostream>
using namespace std;
void filler(int a[3][4])
{
	int sum = 0;
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			sum += a[i][j];

		}
		cout << sum << " ";
		sum = 0;
	}
	cout << endl;
}
void main()
{
	int a[3][4];
	for (int j = 0; j < 3; j++) 
	{
		for (int i = 0; i < 4; i++)
		{
			cout << "Please enter a value for the cell number [" << j << "][" << i << "] : ";
			cin >> a[j][i];
		}
	}
	filler(a);
	system("pause");
}