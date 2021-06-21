#include<iostream>
#include<cstring>
#include<cctype>
using namespace std;
void Aplphafrequency(char*c)
{
	int counter = 0;
	for (int i = 0; i < strlen(c); ++i)
	{
		counter = 0;
		for (char j = 'a'; j <= 'z'; ++j)
			if (c[i] == j)
			{
				++counter;
				cout << j << " : " << counter << endl;
			}
	}
}
void main()
{
	char c[100];
	cin.getline(c, sizeof(c));
	Aplphafrequency(c);
	system("pause");
}