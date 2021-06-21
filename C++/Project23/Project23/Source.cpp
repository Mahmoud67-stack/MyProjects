#include<iostream>
using namespace std;
void main()
{
	int x,y=1;
	cout << "Please enter an integer: "; cin >> x;
	while(y<=9)
	{
		int temp;
		if (x > 10) {
			temp = x % 10;
			if ((temp / y) + 1 + y == temp) {
				cout << "The integer " << x << " is a perfect integer" << endl;
				y = 10;
			}
		}
		else
		{
			if ((x / y) + 1 + y == x) {
				cout << "The integer " << x << " is a perfect integer" << endl;
				y = 10;
			}
		}
		++y;
	} 
	system("pause");
}