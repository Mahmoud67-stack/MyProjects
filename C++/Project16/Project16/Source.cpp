#include<iostream>
using namespace std;
void main()
{
	double total = 0; int stdnum, grade(0); cout << "Please enter the number of students that took the quiz: "; cin >> stdnum;for (int i = 0;i < stdnum; i++)
	{
		while (grade <= 100)
		{
			cout << "Enter the grade of the student: "; cin >> grade;
			
		}
		total += grade;
	}
	cout << "The average is: " << total / stdnum << endl; system("pause");
	
}