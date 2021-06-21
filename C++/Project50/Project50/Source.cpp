#include<iostream>
using namespace std;
void main()
{
	int x, h;
	cout << "Please enter the base: " << endl;
	cin >> x;
	cout << "Please enter the height: " << endl;
	cin >> h;
	for (int i = x; i>= 1; --i)
	{
		{
			for (int n = i; n <= x; n++)
				cout << "*";
		}
		cout << endl;
	}
	system("pause");
}