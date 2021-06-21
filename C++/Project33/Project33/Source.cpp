#include<iostream>
using namespace std;
int is_prime(int x);
void main()
{
	int y;
	cout << "Please enter an integer: " << endl;
	cin >> y;
	cout << is_prime(y) << endl;
	system("pause");
}
int is_prime(int x)
{
	int res(0);
	for (int n = 1; n <= x; ++n)
	{
		if (x%n !=0)
			++res;
	}
	if (res==x-2)
		cout << x << " is a prime number" << endl;
	else
		cout << x << " is not a prime number" << endl;
	return x;
}
