#include<iostream>
using namespace std;
double sec_hms(int x=0);
void main()
{
	int x;
	cout << "Please enter the a positive integer: " << endl;
	cin >> x;
	cout << sec_hms(x) << endl;
	system("pause");
}
double sec_hms(int x)
{
	double a = (x % 3600) / 60;
	cout << "The hours count: " << x / 3600 << endl << "The minutes count:  " << ((x % 3600) / 60) << endl << "The secs count: " << ((a % 60)/60) << endl;
	return 0;
}
