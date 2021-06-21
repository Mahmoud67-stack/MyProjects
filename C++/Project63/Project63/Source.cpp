#include<iostream>
#include<string>
#include<cctype>
using namespace std;
void chars_digits(char a[], int & alphs, int & digits)
{
	int l = strlen(a);
	for (int i = 0; i < l; ++i)
	{
		if (isalpha(a[i]))
			++alphs;
		else if (isdigit(a[i]))
			++digits;
	}
}
void main()
{
	char a[100];
	int x(0), y(0);
	cout << "Please enter a word: "; 
	cin >> a;
	chars_digits(a, x, y);
	cout << "The number of digits in the word is: " << y << endl;
	cout << "The number of alphabets in the word is: " << x << endl;
	system("pause");
}