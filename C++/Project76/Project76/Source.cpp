#include<iostream>
using namespace std;
int increment(int &x)
{
	++x;
	return x;
}
void main()
{
	int y = 0;
	cout << increment(y) << endl;
	system("pause");
}