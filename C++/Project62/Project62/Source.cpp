#include<iostream>
using namespace std;
int myLen(char str[])
{
	int i = 0;
	while (true)
	{
		if (str[i] == '\0')
			return i;
		else i++;
	}
			
}
int indexOf(char str[], char target)
{
	for (int i = 0; i < myLen(str); i++)
		if (str[i] == target)
			return i;
	return -1;
}
int lastIndexOf(char str[], char target)
{
	for (int i =myLen(str)-1; i >=0 ; i--)
		if (str[i] == target)
			return i;
	return -1;
}
void main()
{
	char str[20];
	cout << "Please enter a word: ";
	cin >> str;
	cout <<"The length of the word is: "<< myLen(str)<< endl;
	char target;
	cout << "Please enter a target to find its index: ";
	cin >> target;
	cout << "First occurrence found at " << indexOf(str, target) << " and the last occurence found at " << lastIndexOf(str, target) << endl;
	system("pause");
}
//#include <iostream>
//using namespace std;
//int lenOf(char str[])
//{
//	int i = 0;
//
//	while (str[i] != '/0')
//	{
//		i++;
//	}
//	return i;
//}
//int indexOf(char str[], char target)
//{
//	int i = 0;
//	while (i < lenOf(str) )
//	{
//		if (str[i] == target)
//			return i;
//		i++;
//	}
//	return -1;
//}
//int lastIndexOf(char str[], char target)
//{
//	int i = lenOf(str) - 1;
//	while (i >= 0)
//	{
//		if (str[i] == target)
//			return i;
//		i--;
//	}
//	return -1;
//}
//void main()
//{
//	char word[20], x;
//	cout << "word " << endl;
//	cin >> word;
//	cout << "The length of the array is: " << lenOf(word) << endl;
//	cout << "Please enter a character to find its first and last index: " << endl;
//	cin >> x;
//	cout << "The first index is: " << (word, x) << endl << "The last index is: " << lastIndexOf(word, x) << endl;
//	system("pause");
//}