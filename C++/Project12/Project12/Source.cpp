#include<iostream>
using namespace std;
int main()
{
	float x, y;
	cout << "Please enter X and Y : ";
	cin >> x;
	cin >> y;
		int res = x*x / (2 * y);
	cout << "X^2/(2*Y) = " << res << endl;
	system("pause");
	return 0;
}