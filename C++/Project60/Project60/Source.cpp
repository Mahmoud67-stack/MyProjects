#include<iostream>
#include<cstring>
#include<cctype>
using namespace std;
void form(char *s)
{
	if (s[strlen(s) - 1] == 'y')
	{
		s[strlen(s) - 1] = 'i'; s[strlen(s)] = 'e'; s[strlen(s) + 1] = 's'; s[strlen(s) + 2] = '\0';
		cout << s << endl;
	}
	else if (s[strlen(s) - 1] == 's' || (s[strlen(s) - 1] == 's'&&s[strlen(s)] == 'h'))
	{
		s[strlen(s) + 1] = 'e'; s[strlen(s) + 2] = 's'; s[strlen(s) + 3] = '\0';
		cout << s << endl;
	}
	else
	{
		s[strlen(s)] = 's'; s[strlen(s) + 1] = '\0';
		cout << s << endl;
	}
}
using namespace std;
void main()
{
	char i[100];
	cout << "Please enter the words to find their plurals: " << endl;
	while (cin.getline(i, sizeof(i)))
	{
		form(i);
		i[100]= NULL;
	}
	system("pause");
}