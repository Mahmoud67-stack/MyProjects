#include<iostream>
using namespace std;
void main()
{
	int stdnum, total = 0, grade;
	cout << "Please enter the number of students who took the quiz: "; cin >> stdnum;
	for (int c = 0; stdnum > c; c++)
	{
		cout << "Please enter the grade: "; cin >> grade;
		total += grade;
	}
	cout << "The value of the average is= " << total / stdnum << endl;
	system("pause");
}
