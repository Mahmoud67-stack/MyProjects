#include<iostream>
using namespace std;
void main()
{
	int a;
	cout << "Enter a positive integer between 1 and 7: "; cin >> a;
	switch (a)
	{
	case 7:cout << "the day is Saturday: " << endl;
		break;
	case 1: cout << "The day is Sunday" << endl;
		break;
	case 2:cout << "The day is Monday" << endl;
		break;
	case 3:cout << "The day is Tuesday" << endl;
		break;
	case 4:cout << "The day is Wednesday" << endl;
		break;
	case 5:cout<<"The day is Thursday" << endl;
		break;
	case 6:cout << "The day is Friday" << endl;
		break;
	default:cout << "The user has entered an invalid integer" << endl;
	}
	system("pause");
}