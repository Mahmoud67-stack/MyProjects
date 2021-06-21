#include<iostream>
using namespace std;
int main()
{
	double a = 0, b = 0;
	cout << "enter value of a: ", cin >> a;
	cout << "enter value of b: ", cin >> b;
	if (a > b)
	{
		cout << "value of a is greater than b" << endl << "value of a is: \t" << a << "	value of b is: " << b << endl;
	}
	system("pause");
	return 0;
}