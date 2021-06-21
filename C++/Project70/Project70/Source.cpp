#include<iostream>
using namespace std;
void main()
{
	int x;
	double tot = 0, m;
	cout << " Enter shiet: " << endl;
	cin >> x;
	for (double i = 1; i <= x; i++)
	{
		if (i + 1 < 10)
			m = .1;
		else
			m = .01;
		tot += i + ((i+1)*m);
	}
	cout << "The sum: " << tot << endl;
	system("pause");
}