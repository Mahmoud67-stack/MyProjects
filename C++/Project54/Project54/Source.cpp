#include <iostream>
#include<fstream>
using namespace std;
void replace(char *s, char from, char to)
{
	for (int i = 0; i < strlen(s); i++)
		if (s[i] == from)
			s[i] = to;
}
void main()
{
	int size(500);
	char *S = new char[size];
	ifstream mycin("string.txt");
	if (mycin.fail())
	{
		cout << "Error, cannot access file\n";
		exit(0);
	}
	mycin.getline(S, size, '\n');
	mycin.clear();
	mycin.close();
	cout << "Enter letter to change from: ";
	char from;
	cin >> from;
	cout << "Enter letter to change to: ";
	char to;
	cin >> to;
	replace(S, from, to);
	ofstream mycout("string.txt");
	if (mycin.fail())
	{
		cout << "Error, cannot access file\n";
		exit(0);
	}
	mycout << S;
	mycout.clear();
	mycout.close();
	delete[] S;
	system("pause");
}

