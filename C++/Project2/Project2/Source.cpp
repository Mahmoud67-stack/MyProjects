#include<iostream>
using namespace std;
int main()
{
	double a, z;
	a = 0, z = 0;
	while (a != -1)
	{
		cout << "add a: ", cin >> a;
		z += a;
		cout << "the result is: " << z << endl;
	}
	system("pause");
	return 0;
}