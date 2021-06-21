#include<iostream>
#include<cmath>
using namespace std;
int main() 
{
	int n,x=1;
	cout << "Enter an integer n: ";
	cin >> n;
	int sum = 0;
	while(x<n)
	{
		if (n%x == 0) 
		{
			if ((n / x) + (x + 1) == n) 
				{
					cout << "The integer" << n << "is perfect" << endl;
				}
			else
			{
				cout << "The integer" << n << "is not perfect" << endl;
			}
			}
	}
	system("pause");
	return 0;
}


