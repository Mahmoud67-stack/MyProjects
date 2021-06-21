#include<iostream>
using namespace std;
void main()
{
	int x,y;
	cin >> x;
	cin >> y;
	while (x <= y)
	{
		if (x % 2 != 0)
			cout << x<<endl;
		++x;
	}
	system("pause");
}