#include<iostream>
#include<cstring>
#include<cctype>
using namespace std;
void frequency(char*c)
{
	int count = 0;
	for (char j = 'a'; j <= 'z'; ++j)
	{
		count = 0;
		for (int i = 0; i < strlen(c); ++i) 
		{
			if (c[i] == j)
				count++;
		}
		if(count!=0)
			cout << j << ":" << count << endl;
	}
}
void main() 
{
	char c[100];
	cout << "Please enter a string: " << endl;
	cin.getline(c, sizeof(c));
	frequency(c);
	system("pause");
}