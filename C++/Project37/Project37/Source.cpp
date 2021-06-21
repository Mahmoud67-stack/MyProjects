#include<iostream>
using namespace std;
void main()
{
	int res(1),d(0);
	for (int y = 1; y <= 3; ++y)
	{
		for (int z = y; z>=1; --z)
			res *= z;
		d += res;
	}
	cout << d << endl;
	system("pause");
}