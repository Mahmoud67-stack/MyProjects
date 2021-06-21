#include<iostream>
#include<cctype>
using namespace std;
bool fun(int x)
{
	int j = 0;
	for (int i = 1; i < x; ++i)
		if (x%i == 0)
			++j;
	if (j == 1)
		return true;
	else return false;
}
void main()
{
	int x;
	cout << "Please enter an integer: " << endl;
	cin >> x;
	if (fun(x))
		cout << x << " is a prime integer" << endl;
	else
		cout << x << " is not a prime integer" << endl;
	system("pause");
}