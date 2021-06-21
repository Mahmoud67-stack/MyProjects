#include<iostream>
using namespace std;
int main()
{
	double a, b,x,z,u;
	cout << "enter a: ", cin >> a;
	cout << "enter b: ", cin >> b;
	x = a + b, z = b - a, u = x / z;
	cout << "result of x: " << x << endl;
	cout << "result of z: " << z << endl;
	cout << "result of u: " << u << endl;
	system("pause");
	return 0;
}