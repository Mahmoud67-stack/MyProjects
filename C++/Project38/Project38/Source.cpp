#include<iostream>
using namespace std;
int filler(int b[3][4],int x, int y)
{
	int s=0,z=0,c=0;
	for (int y = 0; y >= 4; y++)
	{
		s += b[0][y];
		z += b[1][y];
		c += b[2][y];
	}
	int a[] = { s,z,c };
	cout << "The 1-d array is: " << a[3] << endl;
	return 0;
}
void main()
{
	int x, y;
	int b[3][4],a[3];
	cout << "Please enter the values of the 2-d array " << endl;
	for (int i = 0; i <= 3; i++)
	{
		for (int n = 0; n <= 4; n++) {
			cout << "Enter a value for the cell [" << i << "][" << n << "] :" << endl;
			cin >> b[i][n];
		}
	}
	cout << filler(b,3,4);
	system("pause");
}