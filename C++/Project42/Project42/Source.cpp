#include<iostream>
using namespace std;
int const m = 3;
int const n = 4;
void main()
{
	int b[m][n];
	for (int h = 0; h < m; h++)
	{
		for (int j = 0; j < n; j++)
		{
			cout << "Please enter a value for the cell number" << "[" << h << "][" << j << "]" << endl;
			cin >> b[h][j];
		}
	}
	for (int h = 0; h < m; h++)
	{
		for (int j = 0; j < n; j++)
		{
			if (h % 2 != 0 && j % 2 != 0)
				cout << "The element " << b[h][j] << " is inside a odd number cell" << endl;
		}
	}

	system("pause");
}
