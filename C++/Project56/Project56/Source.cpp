#include<iostream>
#include<fstream>
#include<cctype>
using namespace std;
void main()
{
	char ch[11];
	int c = 0, v = 0, b = 0;
	cout << "Please enter 10 charachters: " << endl;
	while (cin >> ch)
	{
		if (isspace((int)ch))
			++v;
		else if (isdigit((int)ch))
			++c;
		else if (ispunct((int)ch))
			++b;
	}
	cout << "The number of white spaces: " << v << endl << "The number of digits: " << c << endl << "The number of punctuations: " << b << endl;
	system("pause");
}