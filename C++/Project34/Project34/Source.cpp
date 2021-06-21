#include<iostream>
using namespace std;
void main()
{
	int x, y;
	cout << "Please enter two positive integers: " << endl;
	cin >> x;
	cin >> y;
	if (x > y)
		cout << "Error";
	else
		while (x <= y)
		{
			if (x % 4 == 0)
				cout << x << " is a multipile of 4" << endl;
			++x;
		}
	system("pause");
}