#include<iostream>
using namespace std;
void main()
{
	int x,sum=0;
	cout << "Please enter an integer: "; cin >> x;
	for(int z=0; z<=x; ++z)
	{
		if (z% 2 != 0)
			sum += pow((double)z, 3.0);
	}
	cout << "The sum is: " << sum << endl;
	system("pause");
}