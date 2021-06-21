#include<iostream>
using namespace std;
void filler(int b[3][4], int x, int d)
{
	int s = 0, z = 0, c = 0;
	for (int y = 0; y < d; y++)
	{
		s += b[0][y];
		z += b[1][y];
		c += b[2][y];
	}
	cout << "The 1-d array is: " << s << " " << z << " " << c << endl;
}
void main()
{
	int x, y;
	int b[3][4], a[3];
	cout << "Please enter the values of the 2-d array " << endl;
	for (int i = 0; i < 3; i++)
	{
		for (int n = 0; n < 4; n++) {
			cout << "Enter a value for the cell [" << i << "][" << n << "] :" << endl;
			cin >> b[i][n];
		}
	}
	filler(b, 3, 4);
	system("pause");
}