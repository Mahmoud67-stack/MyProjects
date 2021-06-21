#include<iostream>
using namespace std;
void main()
{
	double x, z = 0;
	cout << "Please enter the value of x: "; cin >> x;
	while (x > 0)
	{
		cout << "Please enter the value of x: "; cin >> x;
		z += x;
		cout << "The result is: " << z << endl;
	}
	system("pause");
}