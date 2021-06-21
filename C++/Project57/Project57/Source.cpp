#include<iostream>
#include<fstream>
using namespace std;
void main()
{
	char x;
	int count = 0;
	ifstream a("a.txt");
	while (a>>x)
	{
		if (x == 'a')
			++count;
		else if (x == 'e')
			++count;
		else if (x == 'i')
			++count;
		else if (x == 'o')
			++count;
		else if (x == 'u')
			++count;
	}
	cout << "The number of vowels in the paragraph is: " << count << endl;
	system("pause");
}