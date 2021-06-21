#include<iostream>
#include<cstring>
using namespace std;
void replace(char *s, char from, char to)
{
	for (int i = 0; i < strlen(s); ++i)
	{
		if (s[i] == from)
			s[i] = to;
	}
	for (int i = 0; i < strlen(s); ++i)
		cout << s[i];
	cout << endl;
}
void main()
{
	char c[100];
	int count = 0;
	char n, x;
	cout << "please enter the letter you want to change from: " << endl;
	cin >> n;
	cout << "Please enter the letter you want to change to: " << endl;
	cin >> x;
	cout << "Please enter the string: " << endl;
	while (cin.getline(c, sizeof(c) && count == 0))
	{
		++count;
	}
	replace(c, n, x);
	system("pause");
}