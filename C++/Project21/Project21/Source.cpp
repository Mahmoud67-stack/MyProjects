#include<iostream>
using namespace std;
void main()
{
	int x = 0, z = 0, y = 0;
	while (x != -1)
	{
		cout << "Please enter an integer: "; cin >> x;
		if (x % 2 == 0)
			z++;
		else
			y++;
	}
	cout << y << z;
	system("pause");
}