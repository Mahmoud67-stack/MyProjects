#include<iostream>
using namespace std;
void main()
{
	int x, y;
	cout << "Please enter two integers: " << endl;
	cin >> x;
	cin >> y;
	if (x > y)
		cout << "Error" << endl;
	else
	{
		while (y > x)
		{
			if (x % 4 == 0)
				cout << x << " ";
			++x;
		}
		cout << endl;
	}
	system("pause");
}