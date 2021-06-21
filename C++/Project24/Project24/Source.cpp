#include<iostream>
using namespace std;
void main()
{
	int x, y = 1;
	cout << "Please enter an integer: "; cin >> x;
	while (y <= 9)
	{
		if (x > 10) {
			cout << "Please enter a valid number: "; cin >> x;
		}
		else {
			if ((x / y) + 1 + y == x) {
				cout << "The integer " << x << " is a perfect integer" << endl;
				y = 10;
			}
			}
		++y;
	}
	if ((x / y) + 1 + y != x) 
		cout << "The integer " << x << " is not a perfect integer" << endl;
	system("pause");
}
