#include<iostream>
using namespace std;
void main()
{
	int x , z = 0, y = 0;
	cout << "Please enter an integer: "; cin >> x;
	while (x != -1)
	{
		cout << "Please enter an integer: "; cin >> x;
		if (x % 2 == 0 && x != 1)
			z++;
		else
			y++;
	}
	cout << "The number of even numbers: " << z << endl;
	cout << "The number of odd numbers: " << y << endl;
	system("pause");
}