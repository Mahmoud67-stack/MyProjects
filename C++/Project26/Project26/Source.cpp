#include<iostream>
using namespace std;
int sum(int x, int y)
{
	return x + y;
}
void text()
{
	cout << "Welcom to the pussy's program" << endl;
}
void main()
{
	double x, y, i = 0, n, tot = 0.0;
	cout << "Please enter a value for x and y" << endl;
	cin >> x;
	cin >> y;
	cout << " Please enter how many times you want to do the summation: "; cin >> n;
	while (x != 0 && n > i)
	{
		tot += (x + y);
			++i;
		}
		cout << "The sum of " << x << " and " << y <<" "<< n<<" times is: " << tot << endl;
	system("pause");
}