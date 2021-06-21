#include<iostream>
using namespace std;
const int m = 3, n = 7;
void tigerinfo(int a[m][n])
{
	float x = 0,tot=0,max=a[0][0], min;
	for (int i = 0; i < m; i++)
	{
		for (int j = 0; j < n; j++)
		{
			tot += a[i][j];
			x++;
			if (max < a[i][j])
			{
				min = max;
				max = a[i][j];
			}
			else
			{
				min = a[i][j];
				max = a[0][0];
			}
		}
	}
	cout << "The average is: " << (tot / x) << endl;
	cout << " The max is: " << max << endl;
	cout << "The min is: " << min << endl;
}
void main()
{
	int a[m][n];
	for (int i = 0; i < m; ++i)
	{
		for (int j = 0; j < n; ++j)
		{
			cout << "Please enter an integer: "; cin >> a[i][j];
		}
	}
	tigerinfo(a);
	system("pause");
}