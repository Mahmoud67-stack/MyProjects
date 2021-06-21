#include<iostream>
#include<cmath>
using namespace std;
void main()
{
	int n, tot (0), z, temp;
	cout << "Plaese enter a value of n: "; cin >> n;
	while (n>=1)
	{
		if (n % 2 == 0)
			z = n - 1;
		else
			z = n;
		temp = pow(z, 3);
		z -= 2;
		tot += temp;
	}
	cout << "The sum of odd integers from 1 to " << n << " is: " << tot << endl;
	system("pause");
}