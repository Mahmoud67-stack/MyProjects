#include<iostream>
using namespace std;
void main()
{
	int a, fact = 1;
	cout << "Enter a number to find its factorial: " << endl;
	cin >> a;
	for (int i = 1; i <= a; i++)
	{
		fact *= i;
	}
	cout << "The factorial of " << a << " is: " << fact << endl;
	system("pause");
}