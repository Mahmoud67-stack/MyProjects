#include<iostream>
using namespace std;
bool hydroxide(char*p, int n)
{
	if (p[n - 2] == 'O' && p[n - 1] == 'H')
		return true;
	return false;
}
void main()
{
	cout << "Please enter:"; 
	char*a = new char[100000000];
	cin >> a;
	int length = strlen(a);
	if (hydroxide(a, length) == true)
		cout << "The substance contains hydroxide";
	else
		cout << "The substance doesnt contain hydroxide";
	cout << endl;
	delete[]a;
	system("pause");
}