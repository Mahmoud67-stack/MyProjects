#include<iostream>
using namespace std;
int main() 
{
	int x;
	cout << "Input a number to find the last prime number occurs before the number: ";
	cin >> x;
	for (int y = --x; y > 0; --y)
	{
		int u = 0;
		for (int i = 1; i < 10; ++i)
			if (y%i == 0)
				++u;
		if (u == 0)
		{
			cout << "The first number that comes before " << x << " is: " << y << endl;
			return 0;
		}
	}
	system("pause");
	return 0;
}