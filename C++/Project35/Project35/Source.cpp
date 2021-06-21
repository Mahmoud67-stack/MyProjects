#include<iostream>
using namespace std;
void main()
{
	int x(1),n(1);
	cout << "Please enter an integer: "<< endl;
	cin >> x;
	while (n < 9)
	{
		if (((x / n) + 1 + n) == x)
		{
			cout << "gg" << endl;
			n = 10;
		}
		++n;
	}
	system("pause");
}