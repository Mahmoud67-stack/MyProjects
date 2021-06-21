#include<iostream>
using namespace std;
void main()
{
	double  average, total = 0; int stdnum;
	cout << "Please enter the number of students that took the quiz: "; cin >> stdnum;
	for (int gradecounter = 0, stdnum = 1, grade = 0; gradecounter<stdnum, grade <= 100; ++gradecounter, ++stdnum)
	{
		cout << "Enter the grade of the student number " << stdnum << ": "; cin >> grade;
		total += grade;
	}
	cout << "The average is: " << total / stdnum << endl;
	system("pause");
}