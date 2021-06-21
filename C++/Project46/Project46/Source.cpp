#include<iostream>
using namespace std;
float m = 3.67;
float exchange(float &aed, float rate)
{
	return (aed*rate);
}
void main()
{
	float aed, rate, y;
	cin >> aed >> rate;
	cout << exchange(aed, rate);
	system("pause");
}