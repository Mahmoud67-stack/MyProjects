#include<iostream>
using namespace std;
void main()
{
	for (int s = 10; s >=1; --s)
	{
		cout << " ";
			for (int n = 1; n <= 10; ++n)
				cout << "*" << endl;
	}
	system("pause");
}