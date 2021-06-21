#include<iostream>
#include<cstring>
using namespace std;
int main() {
	int count = 0;
	char word[20];
	while (cin>>word&&EOF)
	{
		++count;
	}
	cout << "The number of words :" << count << endl;
	return 0;
}
