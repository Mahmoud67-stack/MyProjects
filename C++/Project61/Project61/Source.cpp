#include <iostream>
using namespace std;
int lenOf(char str[])
{
	int i = 0, len = 0;

	while (str[i] != '/0')
	{
		i++;
	}
	return i;
}
int indexOf(char str[], char target)
{
	int i = 0;
	while (i <= (lenOf(str) - 1))
	{
		if (str[i] == target)
			return i;
		i++;
	}
	return -1;
}
int lastIndexOf(char str[], char target)
{
	int i = lenOf(str) - 1;
	while (i>=0)
	{
		
		if (str[i] == target)
			return i;
		i--;
	}
	return -1;
}
void main()
{
	char word[20], x;
	cout << "word " << endl;
	cin >> word;
	cout << "The length of the array is: " << lenOf(word) << endl;
	cout << "Please enter a character to find its first and last index: " << endl;
	cin >> x;
	cout << "The first index is: " << (word, x) << endl << "The last index is: " << lastIndexOf(word, x) << endl;
	system("pause");
}