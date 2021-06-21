#include<iostream>
using namespace std;
int main()
{
	double a, z;
	a = 0;
	z = 0;
	cin >> a;
	while (true)
	{
		if (a == -1)
			break;
		z += a;
		cin >> a;
	}
	cout << z << endl;
			system("pause");
			return 0;
		}