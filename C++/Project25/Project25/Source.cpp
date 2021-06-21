#include<iostream>
using namespace std;
void main()
{
	int x, tot(0);
	cout << "Please enter an integer: ";
	cin >> x;
	for (int y = 1; y < x; ++y)
	{
		if (x%y == 0)
			tot += y;
	}
	if (tot == x)
		cout << x << " is a perfect number. \n";
	else
		cout << x << " is not a perfect number. \n";
	system("pause");
}
