#include<iostream>
using namespace std;
int sum(int ary[], int x)
{
	int y = 0;
	for (int n = 0; n < x; n++)
		y += ary[n];
	cout << "The sum of the elements inside the arry is:" << endl;
	return y;
}
float average(int ary[], int x)
{
	double z = 0.0;
	for (int n = 0; n < x; n++)
		z += ary[n];
	cout << "The average of the elements inside the array is: " << endl;
	return (z / x);
}
int min(int ary[], int x)
{
	int c;
	for (int n = 0; n < x; n++)
	{
		c = ary[0];
		if (c > ary[n])
			c = ary[n];
	}
	cout << "The min value in the array is: " << endl;
	return c;
}
int max(int ary[], int x)
{
	int b;
	for (int n = 0; n < x; n++)
	{
		b = ary[0];
		if (b < ary[n])
			b = ary[n];
	}
	cout << "The max value is: " << endl;
	return b;
}
void main()
{
	int b[5];
	for (int n = 0; n < 5; n++)
	{
		cout << "Please enter value for the cell number " << n << endl;
		cin >> b[n];
	}
	cout << sum(b, 5) << endl;
	cout << average(b, 5) << endl;
	cout << min(b, 5) << endl;
	cout << max(b, 5) << endl;
	system("pause");
}
