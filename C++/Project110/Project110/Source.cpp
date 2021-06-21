#include<iostream>
#include<cmath>
using namespace std;
double calculateSalary(int grade, double base_salary,double&HRA,double &car_allowance)
{
	double total_salary;
	if (grade == 1)
	{
		HRA = 0.12 * base_salary;
		car_allowance = 0.1 * base_salary;
		total_salary = base_salary + HRA + car_allowance;
		return total_salary;
	}
	else
	{
		HRA = 0.2 * base_salary;
		car_allowance = 0.15 * base_salary;
		total_salary = base_salary + HRA + car_allowance;
		return total_salary;
	}
}
int main()
{
	double basesalary, Grade , base_salary,HRA=0,car_allowance=0;
	cout << "enter your base salary: " << endl;
	cin >> basesalary;
	cout << "enter your grade (1 or 2): " << endl;
	cin >> Grade;
	double answer = calculateSalary(Grade,basesalary,HRA, car_allowance);
	cout << "The HRA amount is: " << HRA << endl;
	cout << "The car allowance amount is: " << car_allowance << endl;
	cout<<"The total salary is: "<< answer << endl;
	system("pause");
	return 0;
}