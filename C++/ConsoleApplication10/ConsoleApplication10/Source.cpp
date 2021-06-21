#include<iostream>
using namespace std;
int main()
{
	double a, z;
	a = 0;
	z = 0;
	cin >> a;
	while (a != -1)
	{
		cin >> a;
		z += a;
		cout << "the result is :" << z << endl;
	}
	system("pause");
	return 0;
}
